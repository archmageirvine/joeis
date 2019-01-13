package irvine.oeis.a256;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A256961.
 * @author Sean A. Irvine
 */
public class A256961 implements Sequence {

  private int mInvalid = 50;
  private int[] mState = new int[mInvalid * 2];
  private int mN = 2;

  {
    IntegerUtils.identity(mState);
  }

  private void reverse(final int[] a, final int start, final int length) {
    for (int k = start, j = start + length - 1; k < j; ++k, --j) {
      final int t = a[k];
      a[k] = a[j];
      a[j] = t;
    }
  }

  private int iterate(final int n) {
    final int leader = mState[n];
    for (int k = n; k + leader < mInvalid; k += leader) {
      reverse(mState, k, leader);
    }
    // Move last valid down to last block successfully reversed
    mInvalid = mInvalid - (mInvalid - n) % leader;
    // Now do the swap head with number further along
    final int head = mState[n];
    if (n + head >= mInvalid) {
      return -1;
    }
    mState[n] = mState[n + head];
    mState[n + head] = head;
    return mState[n];
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final int res = iterate(mN);
      if (res > 0) {
        return Z.valueOf(res);
      }
      // Double array size and run up again
      mState = new int[mState.length * 2];
      IntegerUtils.identity(mState);
      mInvalid = mState.length;
      for (int n = 3; n < mN; ++n) {
        iterate(n);
      }
    }
  }

}
