package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a013.A013638;

/**
 * A056140 a(n) = n^2 - previousprime(n)*nextprime(n), for n&gt;2.
 * @author Sean A. Irvine
 */
public class A056140 extends A013638 {

  @Override
  public Z next() {
    return Z.valueOf(mN + 1).square().subtract(super.next());
  }
}
