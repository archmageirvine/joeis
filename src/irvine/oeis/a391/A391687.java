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
      //System.out.println(isBordered(new int[] {28, 4, 3, 31, 35, 10, 36, 18, 21, 24, 11, 1, 7, 23, 12, 17, 22, 30, 8, 13, 26, 19, 16, 29, 5, 20, 15, 14, 25, 32, 27, 33, 34, 6, 2, 9}, 6));
      mR = Functions.SQRT.i(n); // row length
      mMagic = mR * (n + 1) / 2;
    }

    private int innerRowSum(final int[] p, final int rowLength, final int row) {
      int innerSum = 0;
      final int offset = row * rowLength;
      for (int k = 1; k < rowLength - 1; ++k) {
        innerSum += p[offset + k] + 1;
      }
      return innerSum;
    }

    private int innerColSum(final int[] p, final int rowLength, final int col) {
      int innerSum = 0;
      for (int k = rowLength; k < p.length - rowLength; k += rowLength) {
        innerSum += p[col + k] + 1;
      }
      return innerSum;
    }

    // Check incremental rows as constructed
    private boolean isBorderedPartial(final int[] p, final int rowLength, final int completedRows) {
      if (p.length <= 9 || completedRows < 3) {
        return true;
      }
      final int innerRow = innerRowSum(p, rowLength, 1);
      for (int k = 2; k < completedRows; ++k) {
        if (innerRowSum(p, rowLength, k) != innerRow) {
          return false;
        }
      }
      return true;
    }

    private boolean isBordered(final int[] p, final int rowLength) {
      if (p.length <= 9) {
        return true;
      }
      final int innerRow = innerRowSum(p, rowLength, 1);
      for (int k = 2; k < rowLength - 1; ++k) {
        if (innerRowSum(p, rowLength, k) != innerRow) {
          return false;
        }
      }
      for (int k = 1; k < rowLength - 1; ++k) {
        if (innerColSum(p, rowLength, k) != innerRow) {
          return false;
        }
      }
      int diag1 = 0;
      for (int k = rowLength + 1; k < p.length - rowLength; k += rowLength + 1) {
        diag1 += p[k] + 1;
      }
      if (diag1 != innerRow) {
        return false;
      }
      int diag2 = 0;
      for (int k = 2 * rowLength - 2; k < p.length - rowLength; k += rowLength - 1) {
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

        if (!isBordered(p, mR)) {
          return false;
        }
      }

      // Check bordered property to extent possible
      if (pos % mR == mR - 2 && pos / mR >= 2 && !isBorderedPartial(p, mR, (pos + 2) / mR)) {
        return false;
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
