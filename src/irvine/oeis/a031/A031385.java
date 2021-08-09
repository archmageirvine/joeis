package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031385 a(n) = prime(4*n-3).
 * @author Sean A. Irvine
 */
public class A031385 extends A000040 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    super.next();
    super.next();
    return res;
  }
}
