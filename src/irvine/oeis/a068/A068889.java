package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068889 Triangular numbers with property that digits alternate in parity individually as well as in concatenation with previous terms.
 * @author Sean A. Irvine
 */
public class A068889 extends A068888 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.multiply(mN.add(1)).divide2();
      if (is(s)) {
        mPrev = s;
        return s;
      }
    }
  }
}
