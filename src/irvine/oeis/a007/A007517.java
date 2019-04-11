package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007517 <code>a(n) =</code> phi(n) * (sigma(n) <code>- n)</code>.
 * @author Sean A. Irvine
 */
public class A007517 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return fs.phi().multiply(fs.sigma().subtract(mN));
  }
}
