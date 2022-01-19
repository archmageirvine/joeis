package irvine.oeis.a330;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A330410 a(n) = 6*prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A330410 extends A000040 {

  @Override
  public Z next() {
    return super.next().multiply(6).subtract(1);
  }
}
