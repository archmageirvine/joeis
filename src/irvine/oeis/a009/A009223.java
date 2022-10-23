package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009223 a(n) = gcd(sigma(n), phi(n)).
 * @author Sean A. Irvine
 */
public class A009223 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.sigma().gcd(fs.phi());
  }
}
