package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031392 a(n) = prime(5*n-4).
 * @author Sean A. Irvine
 */
public class A031392 extends A000040 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return res;
  }
}
