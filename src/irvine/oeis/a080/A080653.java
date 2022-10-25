package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080653 a(1) = 2; for n&gt;1, a(n) is taken to be the smallest integer greater than a(n-1) such that the condition "a(a(n)) is always even" is satisfied.
 * @author Sean A. Irvine
 */
public class A080653 extends A007378 {

  {
    setOffset(1);
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
