package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383968 allocated for SiYang Hu.
 * @author Sean A. Irvine
 */
public class A383968 extends Sequence1 {

  private int mN = 0;
  private long mMask = 0;

  private boolean is(final long set) {
    long seen = 0;
    // In following a,b are offset by 1 (i.e., we have set elements 0..n-1
    for (long a = 0, k = 1; k <= set; k <<= 1, ++a) {
      if ((set & k) != 0) {
        // b must have same parity as a to get an even sum
        for (long b = a, j = k; j <= set; j <<= 2, b += 2) {
          if ((set & j) != 0) {
            seen |= 1L << (a + b);
            if (seen == mMask) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    mMask = (1L << (2 * mN)) / 3; // 10101...01
    long cnt = 0;
    for (long set = 1; set < 1L << mN; set += 2) {
      if (is(set)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
