package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066087 a(n) = gcd(sigma(n), phi(n)) - gcd(sigma(rad(n)), phi(rad(n))); rad = A007947.
 * @author Sean A. Irvine
 */
public class A066087 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final FactorSequence fsRad = Jaguar.factor(fs.squareFreeKernel());
    return fs.sigma().gcd(fs.phi()).subtract(fsRad.sigma().gcd(fsRad.phi()));
  }
}
