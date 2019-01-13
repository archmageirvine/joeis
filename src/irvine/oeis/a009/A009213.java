package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009213.
 * @author Sean A. Irvine
 */
public class A009213 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN);
    return fs.phi().gcd(Z.valueOf(fs.sigma0()));
  }
}
