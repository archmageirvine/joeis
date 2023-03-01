package irvine.oeis.a062;
// manually 2023-03-01

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062401 a(n) = phi(sigma(n)).
 * @author Georg Fischer
 */
public class A062401 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Euler.phi(Jaguar.factor(++mN).sigma());
  }
}
