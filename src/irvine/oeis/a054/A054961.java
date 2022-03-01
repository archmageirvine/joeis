package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054961 Maximal number of binary vectors of length n such that the unions (or bitwise ORs) of any 2 distinct vectors are all distinct.
 * @author Sean A. Irvine
 */
public class A054961 implements Sequence {

  private int mN = -1;
  private int mLimit = 0;
  private boolean[] mSeen = null;
  private int[] mSet = null;
  private int mMax = 0;
  protected long mMaxCount = 1;

  private boolean isPlayable(final int w, final int pos) {
    for (int k = 0; k < pos; ++k) {
      if (mSeen[w | mSet[k]]) {
        return false;
      }
    }
    return true;
  }

  private void search(final int w, final int pos) {
    if (pos >= mMax) {
//      final StringBuilder sb = new StringBuilder();
//      for (int k = 0; k < pos; ++k) {
//        sb.append(Integer.toBinaryString(mSet[k])).append(", ");
//      }
//      System.out.println(sb);
      if (pos > mMax) {
        mMax = pos;
        mMaxCount = 1;
      } else {
        ++mMaxCount;
      }
    }
    for (int s = w + 1; s < mLimit; ++s) {
      if (isPlayable(s, pos)) {
        mSet[pos] = s;
        // Although nominally playable, we still need to be careful because this new word "s"
        // might actually have collision by itself.
        boolean ok = true;
        for (int k = 0; k < pos; ++k) {
          final int or = s | mSet[k];
          if (mSeen[or]) {
            // Unwind and abort
            for (int j = 0; j < k; ++j) {
              mSeen[s | mSet[j]] = false;
            }
            ok = false;
            break;
          }
          mSeen[or] = true;
        }
        if (ok) {
          search(s, pos + 1);
          for (int k = 0; k < pos; ++k) {
            mSeen[s | mSet[k]] = false;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException(); // not likely to get this far anyway
    }
    mLimit = 1 << mN;
    if (mN == 0) {
      return Z.ONE;
    }
    mSeen = new boolean[mLimit];
    mSet = new int[mLimit];
    mMax = 0;
    search(-1, 0);
    return Z.valueOf(mMax);
  }
}
