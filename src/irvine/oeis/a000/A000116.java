package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000116 Number of even sequences with period <code>2n</code> (bisection of A000013).
 * @author Sean A. Irvine
 */
public class A000116 extends A000013 {

  @Override
  public Z next() {
    final Z r = super.next();
    super.next();
    return r;
  }
}

