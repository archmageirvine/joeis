package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035305 Minimum sum of n distinct positive numbers, any n-1 of which sum to a square.
 * @author Sean A. Irvine
 */
public class A035305 extends Sequence1 {

  // After Haikin Fedor

  private static final int LENGTH = 200;
  private static final int SPACE = 6;

  private int mN = 0;
  private final int[] mRest = new int[LENGTH];
  private long mSavedN;
  //private long[] mSavedSquare = new long[LENGTH];

  private void findN(final int k, final int[] index) {
    final long[] square = new long[LENGTH];
    int n = 1;
    while (true) {
      long bigN = 0;
      for (int i = 0; i < k; ++i) {
        square[i] = ((long) (k - 1) * n + index[i]) * ((long) (k - 1) * n + index[i]);
        bigN += square[i];
      }
      bigN /= k - 1;
      if (bigN > square[k - 1]) {
        if (mSavedN == -1 || mSavedN > bigN) {
          mSavedN = bigN;
          //System.arraycopy(square, 0, mSavedSquare, 0, k);
        }
        break;
      } else {
        ++n;
      }
    }
  }

  private void findIndex(final int k, final int startSpace, final int space, final int[] index) {
    final int[] newIndex = new int[LENGTH];
    if (space == 0) {
      int sumRest = 0;
      for (int i = 0; i < k; ++i) {
        sumRest += mRest[index[i]];
      }
      if ((sumRest % (k - 1)) == 0) {
        findN(k, index);
      }
    } else {
      if (startSpace >= 0) {
        System.arraycopy(index, 0, newIndex, 0, startSpace);
      }
      for (int i = startSpace; i < k; ++i) {
        if (i - 1 >= 0) {
          System.arraycopy(index, 1, newIndex, 1, i - 1);
        }
        for (int j = i; j < k; ++j) {
          newIndex[j] = index[j] + 1;
        }
        findIndex(k, i, space - 1, newIndex);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final int[] index = new int[LENGTH];
    mSavedN = -1;
    for (int k = 0; k < LENGTH; ++k) {
      mRest[k] = (k * k) % (mN - 1);
    }
    for (int start = 0; start < mN - 1; start++) {
      for (int k = 0; k < mN; ++k) {
        index[k] = k + start;
      }
      for (int space = 0; space < SPACE; space++) {
        findIndex(mN, 1, space, index);
      }
    }
//    if (mSavedN != -1) {
//      System.out.printf("N(%d) = %d = %d", mN, mSavedN, mSavedN - mSavedSquare[0]);
//      for (int k = 1; k < mN; ++k) {
//        System.out.printf(" + %d", mSavedN - mSavedSquare[k]);
//      }
//      System.out.println();
//    }
    if (mSavedN < 0) {
      throw new UnsupportedOperationException();
    }
    return Z.valueOf(mSavedN);
  }
}

