package irvine.oeis.a057;
// manually

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057022 a(n) = floor((sum of divisors of n) / (number of divisors of n)), or floor(sigma_1(n)/sigma_0(n)).
 * (PARI) <code>a(n) = sigma(n)\numdiv(n);</code>
 * @author Georg Fischer
 */
public class A057022 implements Sequence {

  protected long mN = 0;
  
  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return fs.sigma().divide(fs.sigma0());
  }
}
