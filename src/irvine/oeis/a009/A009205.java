package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009205 <code>a(n) =</code> gcd(d(n), <code>sigma(n))</code>.
 * @author Sean A. Irvine
 */
public class A009205 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Cheetah.factor(mN);
    return fs.sigma().gcd(Z.valueOf(fs.sigma0()));
  }
}
