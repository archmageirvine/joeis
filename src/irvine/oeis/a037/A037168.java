package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A037168 a(n) = 2*prime(n) - 2.
 * @author Sean A. Irvine
 */
public class A037168 extends A000040 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(2);
  }
}
