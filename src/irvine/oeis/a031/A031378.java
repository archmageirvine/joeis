package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031378 a(n) = prime(4*n - 2).
 * @author Sean A. Irvine
 */
public class A031378 extends A000040 {

  @Override
  public Z next() {
    super.next();
    final Z res = super.next();
    super.next();
    super.next();
    return res;
  }
}
