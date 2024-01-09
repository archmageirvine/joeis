package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067817 a(n) = Sum_{r|n, s|n, t|n, r&lt;s&lt;t} r*s*t.
 * @author Sean A. Irvine
 */
public class A067817 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s = fs.sigma();
    return s.pow(3).subtract(s.multiply(fs.sigma2().multiply(3))).add(fs.sigma(3).multiply2()).divide(6);
  }
}
