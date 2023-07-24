package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064697 Numbers n such that A064696(n) = n-1.
 * @author Sean A. Irvine
 */
public class A064697 extends Sequence1 {

  private final int[] mWorkspace = new int[20]; // more than enough for a long
  protected long mN = 0;

  private boolean is(int k, final int zeros) {
    long v = 0;
    while (--k >= 0) {
      v += mWorkspace[k];
      v %= mN;
      if (k > 0) {
        for (int s = 0; s <= zeros; ++s) {
          v *= 10;
          v %= mN;
        }
      }
    }
    return v == 0;
  }

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      int k = 0;
      while (m != 0) {
        mWorkspace[k++] = (int) (m % 10);
        m /= 10;
      }
      for (int s = 1; s < mN; ++s) {
        if (is(k, s)) {
          if (s == mN - 1) {
            return Z.valueOf(mN);
          }
          break;
        }
      }
    }
  }
}
