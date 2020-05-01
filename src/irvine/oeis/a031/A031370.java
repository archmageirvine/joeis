package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031370 <code>a(n) = prime(4n-1)</code>.
 * @author Sean A. Irvine
 */
public class A031370 extends A000040 {

  @Override
  public Z next() {
    super.next();
    super.next();
    final Z res = super.next();
    super.next();
    return res;
  }
}
