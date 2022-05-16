package irvine.oeis.a064;
// manually

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A064840 a(n) = tau(n)*sigma(n).
 * @author Georg Fischer
 */
public class A064840 implements Sequence {

  protected long mN = 0;
  
  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma0().multiply(fs.sigma());
  }
}
