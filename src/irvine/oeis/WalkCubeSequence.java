package irvine.oeis;

import irvine.math.MemoryFunctionInt3;
import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;

/**
 * Number of walks within N^3 / N^2 (the first octant / quadrant of Z^3 / Z^2)
 * starting at (0,0,0) / (0,0), maybe with a condition for the ending.
 * There is one specialized <code>next<em>dst</em></code> method per variant which
 * calls the corresponding, recursive counting method <code>aux<em>dst</em></code>.
 * The suffixes <code>dst</code> are encoded as follows:
 * <ul>
 * <li>d = dimension, 2 or 3</li>
 * <li>s = number of steps, 3 to 9</li>
 * <li>t = empty, "e0": ... and ending at (0,0), "ey": ... and ending on the vertical axis</li>
 * </ul>
 * The frequencies are as follows:
 * <pre>
 *     7 23
 *    11 23ey
 *    20 24
 *     9 24e0
 *    37 24ey
 *    29 25
 *    14 25e0
 *    46 25ey
 *    15 26
 *    10 26e0
 *    27 26ey
 *     5 27
 *     3 27e0
 *     7 27ey
 *     1 28
 *     1 28ey
 *     1 33
 *   243 34
 *  3010 35
 * </pre>
 * @author Georg Fischer
 */
public class WalkCubeSequence implements Sequence {

  protected Z mK; // current number with some property
  protected int mN; // index of current term to be returned
  protected int mOffset; // OEIS offset1 as of generation time
  protected int[][] mMatrix; // 3 coordinate increments (columns) per step (row)
  protected int mDim; // dimension: 2 for square, 3 for cube
  protected int mNoSteps; // number of steps possible at one point
  protected int mFactor; // factor for number of steps (only for 2D)
  protected String mEndCode; // empty, or "e0" = anding at (0,0[,0]), "ey" = ending at the vertical axis
  protected int mMulti; // factor for start of i loop (only for 2D)
  protected int mMultj; // factor for start of j loop (only for 2D)
  private final Sequence mGen;

  /**
   * Construct an instance which computes the walks
   * for the specified step matrix.
   * @param offset first valid term has this index
   * @param dim dimension, 2 or 3
   * @param noSteps number of steps to be selected
   * @param endCode empty, or "e0" = anding at (0,0[,0]), "ey" = ending at the vertical axis
   * @param factor 1 for n steps, 2 for <code>2n</code> steps, 4 for <code>4n</code> steps
   * @param stepCode step matrix encoded as <code>dim</code> digits per step (row),
   * 0, 1 and 2 &gt;= -1, for example 222221210100, dim = 2 &gt;=
   * (-1, -1, -1), (-1, -1, 1), (-1, 1, 0), (1, 0, 0)
   */
  protected WalkCubeSequence(final int offset, final int dim, final int noSteps, final String endCode, final int factor, final String stepCode) {
    mOffset = offset;
    mDim = dim;
    mNoSteps = noSteps; // assert: = stepCode.length() / dim;
    mEndCode = endCode;
    mFactor = factor;
    mMulti = mFactor;
    mMultj = mFactor;
    if ("e0".equals(endCode)) { // ending at (0,0)
      mMulti = 0;
      mMultj = 0;
    } else if ("ey".equals(endCode)) { // ending on vertical axis
      mMulti = 0;
    }
    mMatrix = new int[mNoSteps][dim];
    int icode = 0;
    for (int irow = 0; irow < mNoSteps; ++irow) { // translate the stepCode to the ste increment matrix
      for (int icol = 0; icol < dim; ++icol) {
        int code = stepCode.charAt(icode++) - '0';
        if (code == 2) {
          code = -1;
        }
        mMatrix[irow][icol] = code;
      } // for icol
    } // for irow
    mN = offset - 1;
    mK = Z.valueOf(mN);
    if (dim == 2) {
      switch (noSteps) {
        case 3:
          mGen = new W2Sequence(new W23());
          break;
        case 4:
          mGen = new W2Sequence(new W24());
          break;
        case 5:
          mGen = new W2Sequence(new W25());
          break;
        case 6:
          mGen = new W2Sequence(new W26());
          break;
        case 7:
          mGen = new W2Sequence(new W27());
          break;
        case 8:
          mGen = new W2Sequence(new W28());
          break;
        default:
          throw new RuntimeException();
      }
    } else {
      assert dim == 3;
      switch (noSteps) {
        case 3:
          mGen = new W3Sequence(new W33());
          break;
        case 4:
          mGen = new W3Sequence(new W34());
          break;
        case 5:
          mGen = new W3Sequence(new W35());
          break;
        default:
          throw new RuntimeException();
      }
    }
  }

  private final class W2Sequence implements Sequence {

    private final Walk2MemoryFunctionInt3 mF;

    private W2Sequence(final Walk2MemoryFunctionInt3 f) {
      mF = f;
    }

    @Override
    public Z next() {
      ++mN;
      Z sum = Z.ZERO;
      final int m = mN;
      for (int i = m * mMulti; i >= 0; --i) {
        for (int j = m * mMultj; j >= 0; --j) {
          sum = sum.add(mF.get(i, j, m * mFactor));
        } // for j
      } // for i
      return sum;
    }
  }

  private abstract class Walk2MemoryFunctionInt3 extends MemoryFunctionInt3<Z> {
    @Override
    public Z get(final int i, final int j, final int m) {
      if (i > m || j > m || i < 0 || j < 0) {
        return Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        return i == 0 && j == 0 ? Z.ONE : Z.ZERO;
      } else {
        return super.get(i, j, m);
      }
    }
  }

  private final class W23 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        ;
    }
  }

  private final class W24 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        ;
    }
  }

  private final class W25 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        .add(get(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
        ;
    }
  }

  private final class W26 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        .add(get(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
        .add(get(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
        ;
    }
  }

  private final class W27 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        .add(get(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
        .add(get(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
        .add(get(i - mMatrix[6][0], j - mMatrix[6][1], mn1))
        ;
    }
  }

  /*
  aux[i_Integer, j_Integer, n_Integer] := Which[Min[i, j, n] < 0 || Max[i, j] > n, 0, n == 0, KroneckerDelta[i, j, n], True, aux[i, j, n] = aux[-1 + i, j, -1 + n] + aux[-1 + i, 1 + j, -1 + n] + aux[i, -1 + j, -1 + n] + aux[i, 1 + j, -1 + n] + aux[1 + i, -1 + j, -1 + n] + aux[1 + i, j, -1 + n] + aux[1 + i, 1 + j, -1 + n]]; Table[Sum[aux[i, j, n], {i, 0, n}, {j, 0, n}], {n, 0, 25}]
   */

  private final class W28 extends Walk2MemoryFunctionInt3 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^2 square.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param m current edge length of the square
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        .add(get(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
        .add(get(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
        .add(get(i - mMatrix[6][0], j - mMatrix[6][1], mn1))
        .add(get(i - mMatrix[7][0], j - mMatrix[7][1], mn1))
        ;
    }
  }

  private final class W3Sequence implements Sequence {

    private final MemoryFunctionInt4<Z> mF;

    private W3Sequence(final MemoryFunctionInt4<Z> f) {
      mF = f;
    }

    @Override
    public Z next() {
      ++mN;
      Z sum = Z.ZERO;
      final int m = mN;
      for (int i = m; i >= 0; --i) {
        for (int j = m; j >= 0; --j) {
          for (int k = m; k >= 0; --k) {
            sum = sum.add(mF.get(i, j, k, m));
          } // for k
        } // for j
      } // for i
      return sum;
    }
  }

  private abstract class Walk3MemoryFunctionInt4 extends MemoryFunctionInt4<Z> {
    @Override
    public Z get(final int i, final int j, final int k, final int m) {
      if (i > m || j > m || k > m || i < 0 || j < 0 || k < 0) {
        return Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        return i == 0 && j == 0 && k == 0 ? Z.ONE : Z.ZERO;
      } else {
        return super.get(i, j, k, m);
      }
    }
  }

  private final class W33 extends Walk3MemoryFunctionInt4 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^3 cube.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param k z coordinate of the point
     * @param m current edge length of the cube
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int k, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
        ;
    }
  }

  private final class W34 extends Walk3MemoryFunctionInt4 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^3 cube.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param k z coordinate of the point
     * @param m current edge length of the cube
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int k, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], k - mMatrix[3][2], mn1))
        ;
    }

  }

  private final class W35 extends Walk3MemoryFunctionInt4 {
    /**
     * Determine the number of possible next steps
     * for some point in the m^3 cube.
     * @param i x coordinate of the point
     * @param j y coordinate of the point
     * @param k z coordinate of the point
     * @param m current edge length of the cube
     * @return number of possible steps starting at this point
     */
    @Override
    protected Z compute(final int i, final int j, final int k, final int m) {
      final int mn1 = m - 1;
      return get(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
        .add(get(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
        .add(get(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
        .add(get(i - mMatrix[3][0], j - mMatrix[3][1], k - mMatrix[3][2], mn1))
        .add(get(i - mMatrix[4][0], j - mMatrix[4][1], k - mMatrix[4][2], mn1))
        ;
    }
  }

  /**
   * Get the next term of the sequence.
   * This is an example only, the method is overridden by the specific sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    return mGen.next();
  } // next

  //=====================================
//
//  /**
//   * Test method - shows the b-file.
//   * @param args command line arguments: [no-terms [dim step-code]]
//   */
//  public static void main(String[] args) {
//    WalkCubeSequence seq;
//    int iarg = 0;
//    int noTerms = 16;
//    int dim = 3;
//    if (iarg < args.length) {
//      try {
//        noTerms = Integer.parseInt(args[iarg++]);
//      } catch (Exception exc) {
//      }
//    }
//    if (iarg < args.length) {
//      try {
//        dim = Integer.parseInt(args[iarg++]);
//      } catch (Exception exc) {
//      }
//    }
//    if (iarg < args.length) {
//      String stepCode = args[iarg++];
//      seq = new WalkCubeSequence(1, dim, 4, "", 1, stepCode);
//    } else { // show default: A147999
//      seq = new WalkCubeSequence(1); // the devaul / example: A147999
//    }
//    int n = 0;
//    long startTime = System.currentTimeMillis();
//    while (n < noTerms) {
//      ++n;
//      System.out.println(n + " " + seq.next().toString());
//    } // while
//    System.err.println("# elapsed time: " + String.valueOf(System.currentTimeMillis() - startTime) + "\n");
//  } // main

/* Cf. also
# A149365 Number of walks within N^3 (the first octant of Z^3) starting at (0,0,0) and consisting of n steps
# taken from {(-1, 0, 0), (-1, 0, 1), (0, 1, -1), (1, -1, 1), (1, 0, 1)}
f:= proc(a, b, c, n) option remember;
   local t;
   if n = 0 then return 1 fi;
   t:= procname(a+1, b, c+1, n-1);
   if a >= 1 then t:= t + procname(a-1, b, c, n-1) + procname(a-1, b, c+1, n-1) fi;
   if c >= 1 then t:= t + procname(a, b+1, c-1, n-1) fi;
   if b >= 1 then t:= t + procname(a+1, b-1, c+1, n-1) fi;
   t;
end proc:
seq(f(0, 0, 0, n), n=0..50); # Robert Israel, Nov 07 2017
*/

}
