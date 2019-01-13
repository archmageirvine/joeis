package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000084.
 * @author Sean A. Irvine
 */
public class A000084 extends A000669 {

  @Override
  public Z next() {
    final Z r = super.next();
    return mN == 1 ? r : r.multiply2();
  }
}

