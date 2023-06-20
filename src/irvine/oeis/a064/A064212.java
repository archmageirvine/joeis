package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064212 a(n) = sigma(n) + usigma(n), or A000203(n) + A034448(n).
 * @author Sean A. Irvine
 */
public class A064212 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.sigma().add(fs.unitarySigma());
  }
}

