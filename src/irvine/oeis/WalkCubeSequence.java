package irvine.oeis;

import java.util.HashMap;

import irvine.math.z.Z;

/**
 * Number of walks within N^3 / N^2 (the first octant / quadrant of Z^3 / Z^2)
 * starting at (0,0,0) / (0,0), maybe with a condition for the ending.
 * There is one specialized next<em>dst</em> method per variant which
 * calls the corresponding, recursive counting method aux<em>dst</em>.
 * The suffixes <em>dst</em> are encoded as follows:
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
  protected HashMap<String, Z> mCache; // simulate Maple's "option remember"
  protected int[][] mMatrix; // 3 coordinate increments (columns) per step (row)
  protected int mDim; // dimension: 2 for square, 3 for cube
  protected int mNoSteps; // number of steps possible at one point
  protected int mFactor; // factor for number of steps (only for 2D)
  protected String mEndCode; // empty, or "e0" = anding at (0,0[,0]), "ey" = ending at the vertical axis
  protected int mMulti; // factor for start of i loop (only for 2D)
  protected int mMultj; // factor for start of j loop (only for 2D)

  /**
   * Construct an instance which computes the walks
   * for the specified step matrix.
   * @param offset first valid term has this index
   * @param dim dimension, 2 or 3
   * @param noSteps number of steps to be selected
   * @param endCode empty, or "e0" = anding at (0,0[,0]), "ey" = ending at the vertical axis
   * @param factor 1 for n steps, 2 for 2n steps, 4 for 4n steps
   * @param stepCode step matrix encoded as <em>dim</em> digits per step (row),
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
    if (endCode.equals("e0")) { // ending at (0,0)
      mMulti = 0;
      mMultj = 0;
    }
    if (endCode.equals("ey")) { // ending on vertical axis
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
    mCache = new HashMap<>(16384);
  }

  /**
   * Construct an instance which computes the walks
   * for the default sequence: A147999.
   * @param offset first valid term has this index
   */
  protected WalkCubeSequence(final int offset) {
    mOffset = offset;
    mDim = 3;
    mNoSteps = 4;
    mEndCode = "";
    mFactor = 1;
    mMulti = mFactor;
    mMultj = mFactor;
    // A147999 Number of walks within N^3 (the first octant of Z^3) starting at (0,0,0)
    // and consisting of n steps taken from {(-1, -1, -1), (-1, -1, 1), (-1, 1, 0), (1, 0, 0)}
    mMatrix = new int[][]
      {{-1, -1, -1}
        , {-1, -1, 1}
        , {-1, 1, 0}
        , {1, 0, 0}
      };
    mN = offset - 1;
    mK = Z.valueOf(mN);
    mCache = new HashMap<>(16384);
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next23() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux23(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next23

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux23(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || i < 0 || j < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux23(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux23(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux23(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux23

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next24() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux24(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next24

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux24(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m
        || i < 0 || j < 0
        ) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux24(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux24(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux24(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
          .add(aux24(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux24

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next25() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux25(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next25

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux25(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || i < 0 || j < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux25(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux25(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux25(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
          .add(aux25(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
          .add(aux25(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux25

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next26() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux26(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next26

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux26(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || i < 0 || j < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux26(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux26(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux26(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
          .add(aux26(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
          .add(aux26(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
          .add(aux26(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux26

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next27() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux27(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next27

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux27(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || i < 0 || j < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux27(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux27(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux27(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
          .add(aux27(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
          .add(aux27(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
          .add(aux27(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
          .add(aux27(i - mMatrix[6][0], j - mMatrix[6][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux27

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next28() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m * mMulti; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        sum = sum.add(aux28(i, j, m * mFactor));
      } // for j
    } // for i
    return sum;
  } // next28

  /**
   * Determine the number of possible next steps
   * for some point in the m^2 square.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param m current edge length of the square
   * @return number of possible steps starting at this point
   */
  protected Z aux28(final int i, final int j, final int m) {
    final String key = i + "," + j + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || i < 0 || j < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 4).equals("0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux28(i - mMatrix[0][0], j - mMatrix[0][1], mn1)
          .add(aux28(i - mMatrix[1][0], j - mMatrix[1][1], mn1))
          .add(aux28(i - mMatrix[2][0], j - mMatrix[2][1], mn1))
          .add(aux28(i - mMatrix[3][0], j - mMatrix[3][1], mn1))
          .add(aux28(i - mMatrix[4][0], j - mMatrix[4][1], mn1))
          .add(aux28(i - mMatrix[5][0], j - mMatrix[5][1], mn1))
          .add(aux28(i - mMatrix[6][0], j - mMatrix[6][1], mn1))
          .add(aux28(i - mMatrix[7][0], j - mMatrix[7][1], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux28

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next33() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m; i >= 0; --i) {
      for (int j = m; j >= 0; --j) {
        for (int k = m; k >= 0; --k) {
          sum = sum.add(aux33(i, j, k, m));
        } // for k
      } // for j
    } // for i
    return sum;
  } // next33

  /**
   * Determine the number of possible next steps
   * for some point in the m^3 cube.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param k z coordinate of the point
   * @param m current edge length of the cube
   * @return number of possible steps starting at this point
   */
  protected Z aux33(final int i, final int j, final int k, final int m) {
    final String key = i + "," + j + "," + k + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || k > m || i < 0 || j < 0 || k < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 6).equals("0,0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux33(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
          .add(aux33(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
          .add(aux33(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux33

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next34() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m; i >= 0; --i) {
      for (int j = m; j >= 0; --j) {
        for (int k = m; k >= 0; --k) {
          sum = sum.add(aux34(i, j, k, m));
        } // for k
      } // for j
    } // for i
    return sum;
  } // next4

  /**
   * Determine the number of possible next steps
   * for some point in the m^3 cube.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param k z coordinate of the point
   * @param m current edge length of the cube
   * @return number of possible steps starting at this point
   */
  protected Z aux34(final int i, final int j, final int k, final int m) {
    final String key = i + "," + j + "," + k + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || k > m || i < 0 || j < 0 || k < 0) {
        result = Z.ZERO;
      } else if (m == 0) {
        // the Kronecker delta
        result = key.substring(0, 6).equals("0,0,0,") ? Z.ONE : Z.ZERO;
      } else {
        final int mn1 = m - 1;
        result = aux34(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
          .add(aux34(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
          .add(aux34(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
          .add(aux34(i - mMatrix[3][0], j - mMatrix[3][1], k - mMatrix[3][2], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux34

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  protected Z next35() {
    ++mN;
    Z sum = Z.ZERO;
    final int m = mN;
    for (int i = m; i >= 0; --i) {
      for (int j = m * mMultj; j >= 0; --j) {
        for (int k = m; k >= 0; --k) {
          sum = sum.add(aux35(i, j, k, m));
        } // for k
      } // for j
    } // for i
    return sum;
  } // next5

  /**
   * Determine the number of possible next steps
   * for some point in the m^3 cube.
   * @param i x coordinate of the point
   * @param j y coordinate of the point
   * @param k z coordinate of the point
   * @param m current edge length of the cube
   * @return number of possible steps starting at this point
   */
  protected Z aux35(final int i, final int j, final int k, final int m) {
    final String key = i + "," + j + "," + k + "," + m;
    Z result = mCache.get(key);
    if (result == null) {
      if (i > m || j > m || k > m || i < 0 || j < 0 || k < 0
        ) {
        result = Z.ZERO;
      } else if (m == 0) {
        if (key.substring(0, 6).equals("0,0,0,")) {
          result = Z.ONE; // the Kronecker delta
        } else {
          result = Z.ZERO;
        }
      } else {
        final int mn1 = m - 1;
        result = aux35(i - mMatrix[0][0], j - mMatrix[0][1], k - mMatrix[0][2], mn1)
          .add(aux35(i - mMatrix[1][0], j - mMatrix[1][1], k - mMatrix[1][2], mn1))
          .add(aux35(i - mMatrix[2][0], j - mMatrix[2][1], k - mMatrix[2][2], mn1))
          .add(aux35(i - mMatrix[3][0], j - mMatrix[3][1], k - mMatrix[3][2], mn1))
          .add(aux35(i - mMatrix[4][0], j - mMatrix[4][1], k - mMatrix[4][2], mn1))
        ;
      }
      mCache.put(key, result);
    } // result == null
    return result;
  } // aux35

  /**
   * Get the next term of the sequence.
   * This is an example only, the method is overridden by the specific sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    return next34();
  } // next

  //=====================================
//
//  /**
//   * Test method - shows the b-file.
//   * @param args command line arguments: [noterms [dim stepCode]]
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

} // WalkCubeSequence
