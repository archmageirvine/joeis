package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A074300 Position of first repeat of the opening sequence of length n occurring after the first repeat of the opening sequence of length n-1 in the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A074300 extends A000002 {

  private long mN = 0;
  private long mM = 1;
  private long mR = 0;

  private int get(final long n) {
    while (n > mR) {
      super.next();
      ++mR;
    }
    return isSet(n) ? 2 : 1;
  }

  private boolean is(final long start, final long length) {
    for (long k = 0; k < length; ++k) {
      if (get(k) != get(start + k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (is(++mM, mN)) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}
