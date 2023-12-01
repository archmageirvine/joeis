package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a061.A061026;

/**
 * A067005 Totient of A061026(n) divided by n.
 * @author Sean A. Irvine
 */
public class A067005 extends A061026 {

  @Override
  public Z next() {
    return Euler.phi(super.next()).divide(mN);
  }
}

