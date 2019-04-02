package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001114 Increasing blocks of digits of e.
 * @author Sean A. Irvine
 */
public class A001114 extends A001113 {

  private Z mStore = null;
  private Z mPrev = Z.ZERO;

  // Has a nasty caveat that blocks do not start with 0, so when this
  // would happen, they need to be appended to the previous value

  @Override
  public Z next() {
    Z v = Z.ZERO;
    while (true) {
      v = v.multiply(10);
      v = v.add(mStore == null ? super.next() : mStore);
      mStore = null;
      if (v.compareTo(mPrev) > 0) {
        while ((mStore = super.next()).equals(Z.ZERO)) {
          v = v.multiply(10);
        }
        mPrev = v;
        return v;
      }
    }
  }
}
