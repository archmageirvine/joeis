package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031371 <code>a(n) = prime(5n-1)</code>.
 * @author Sean A. Irvine
 */
public class A031371 extends A000040 {

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    final Z res = super.next();
    super.next();
    return res;
  }
}
