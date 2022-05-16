package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009279 a(n) = lcm(d(n), phi(n)).
 * @author Sean A. Irvine
 */
public class A009279 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.phi().lcm(fs.sigma0());
  }
}
