package irvine.oeis.a022;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022157 <code>a(n) = n^2 - phi(n)*tau(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A022157 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN);
    return mN.square().subtract(fs.phi().multiply(fs.sigma0().square()));
  }
}
