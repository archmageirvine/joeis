package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000117 Number of even sequences with period <code>2n</code> (bisection of <code>A000011)</code>.
 * @author Sean A. Irvine
 */
public class A000117 extends A000011 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}

