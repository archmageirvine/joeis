package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031915 a(n) = prime(8*n - 7).
 * @author Sean A. Irvine
 */
public class A031915 extends A000040 {

  @Override
  public Z next() {
    final Z res = super.next();
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
