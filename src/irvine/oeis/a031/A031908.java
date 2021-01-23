package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031908 a(n) = prime(8*n - 5).
 * @author Sean A. Irvine
 */
public class A031908 extends A000040 {

  @Override
  public Z next() {
    super.next();
    super.next();
    final Z res = super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
    return res;
  }
}
