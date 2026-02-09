package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;
import irvine.oeis.Sequence1;

/**
 * A391687 allocated for Donghwi Park.
 * @author Sean A. Irvine
 */
public class A391687 extends Sequence1 {

  private final ParallelPermutationSequence mS = new ParallelPermutationSequence() {

    private int mR = 0;
    private int mMagic = 0;

    @Override
    protected void prepare(final int n) {
      mR = Functions.SQRT.i(n); // row length
      mMagic = mR * (n + 1) / 2;
    }

    private int innerRowSum(final int[] p, final int row) {
      int innerSum = 0;
      final int offset = row * mR;
      for (int k = 1; k < mR - 1; ++k) {
        innerSum += p[offset + k] + 1;
      }
      return innerSum;
    }

    private int innerColSum(final int[] p, final int col) {
      int innerSum = 0;
      for (int k = mR; k < p.length - mR; k += mR) {
        innerSum += p[col + k] + 1;
      }
      return innerSum;
    }

    private boolean isBordered(final int[] p) {
      // todo make this dynamic as rows completed
      if (p.length <= 9) {
        return true;
      }
      final int innerRow = innerRowSum(p, 1);
      for (int k = 2; k < mR - 1; ++k) {
        if (innerRowSum(p, k) != innerRow) {
          return false;
        }
      }
      for (int k = 1; k < mR - 1; ++k) {
        if (innerColSum(p, k) != innerRow) {
          return false;
        }
      }
      int diag1 = 0;
      for (int k = mR + 1; k < p.length - mR; k += mR + 1) {
        diag1 += p[k] + 1;
      }
      if (diag1 != innerRow) {
        return false;
      }
      int diag2 = 0;
      for (int k = 2 * mR - 2; k < p.length - mR; k += mR - 1) {
        diag2 += p[k] + 1;
      }
      if (diag2 != innerRow) {
        return false;
      }
      return true;
    }

    @Override
    protected boolean accept(final int[] p, final int sum, final int pos1) {
      if (mR == 1) {
        return true; // trivial case
      }
      final int pos = pos1 - 1;
//      System.out.println(Arrays.toString(p) + " " + pos);
      int rowSum = p[pos] + 1;
      int k = pos;
      while (k % mR != 0) {
        rowSum += p[--k] + 1;
        if (rowSum > mMagic) {
  //        System.out.println("sum exceeds " + mMagic);
          return false; // already exceeded allowed sum
        }
      }

      if (pos % mR == mR - 1) {
        // We are completing a row
    //    System.out.println("Checking row " + mMagic);
        if (pos == mR - 1 && p[0] > p[mR - 1]) {
          // First row symmetry invariant top-left < top-right
      //    System.out.println("Fail symmetry");
          return false;
        }
        if (rowSum != mMagic) {
        //  System.out.println("Fail magic: " + rowSum);
          return false;
        }
      }

      if (pos >= p.length - mR) {
        // Extra checks for bottom row
       // System.out.println("Doing bottom checks");
        if (pos == p.length - mR) {
          // bottom left
          if (p[0] > p[pos] || p[mR - 1] > p[pos]) {
       //     System.out.println("Symmtry break");
            return false; // symmetry breaking
          }
          int diagonal = 0;
          for (int j = pos; j >= mR - 1; j -= mR - 1) {
            diagonal += p[j] + 1;
            if (diagonal > mMagic) {
          //    System.out.println("Fail diag1 " + diagonal + " > " + mMagic);
              return false;
            }
          }
          if (diagonal != mMagic) {
          //  System.out.println("Fail diag2 " + diagonal + " != " + mMagic);
            return false;
          }
        }
        int column = 0;
        for (int j = pos; j >= 0; j -= mR) {
          column += p[j] + 1;
          if (column > mMagic) {
        //    System.out.println("Fail col1");
            return false;
          }
        }
        if (column != mMagic) {
      //    System.out.println("Fail col2");
          return false;
        }
      }

      if (pos == p.length - 1) {
        // bottom right
        if (p[0] > p[pos]) {
          return false; // symmetry creaking
        }
        int diagonal = 0;
        for (int j = pos; j >= 0; j -= mR + 1) {
          diagonal += p[j] + 1;
          if (diagonal > mMagic) {
        //    System.out.println("Fail diagb");
            return false;
          }
        }
        if (diagonal != mMagic) {
       //   System.out.println("Fail diagc");
          return false;
        }

        if (!isBordered(p)) {
          return false;
        }
      }
   //   System.out.println("ok");
      return true;
    }
  };

  private int mM = 0;

  @Override
  public Z next() {
    return mS.a(++mM * mM);
  }
}
