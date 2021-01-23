package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014403 Numbers found in denominators of expansion of Airy function Bi(x).
 * @author Sean A. Irvine
 */
public class A014403 extends A014402 {

  @Override
  public Z next() {
    final Z r = super.next();
    return mN < 3 || (mN & 1) == 0 ? r : r.divide(3);
  }
}

