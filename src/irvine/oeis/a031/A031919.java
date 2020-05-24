package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031919 <code>a(n) = prime(10*n-8)</code>.
 * @author Sean A. Irvine
 */
public class A031919 extends A000040 {

  @Override
  public Z next() {
    super.next();
    final Z res = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return res;
  }
}
