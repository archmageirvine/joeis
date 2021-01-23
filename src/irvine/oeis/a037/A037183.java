package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A037183 Smallest number that is palindromic (with at least 2 digits) in n bases.
 * @author Sean A. Irvine
 */
public class A037183 implements Sequence {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final long[] mWorkspace = new long[Long.SIZE];
  private int mN = 0;
  private long mM = 2;
  private long mAdd = 1;

  private boolean isPalindrome(long n, final long base) {
    int pos = 0;
    while (n != 0) {
      mWorkspace[pos++] = n % base;
      n /= base;
    }
    for (int j = 0, k = pos - 1; j < k; ++j, --k) {
      if (mWorkspace[j] != mWorkspace[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 8) {
      // After a(7) result is 0 (mod 12)
      mAdd = 12;
      mM = 108;
    }
    while (mFirsts.get(mN) == 0) {
      mM += mAdd;
      int cnt = 0;
      for (long base = 2; base < mM; ++base) {
        if (isPalindrome(mM, base)) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
