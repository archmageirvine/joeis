package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080653 <code>a(1) = 2</code>; for <code>n&gt;1, a(n)</code> is taken to be the smallest integer greater than <code>a(n-1)</code> such that the condition <code>"a(a(n))</code> is always even" is satisfied.
 * @author Sean A. Irvine
 */
public class A080653 extends A007378 {

  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
