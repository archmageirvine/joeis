package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051709 a(n) = sigma(n) + phi(n) - 2n.
 * @author Sean A. Irvine
 */
public class A051709 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma().add(fs.phi()).subtract(2 * mN);
  }
}
