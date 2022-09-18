package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059358 Coefficients in expansion of Sum_{n &gt;= 1} x^n/(1-x^n)^4.
 * @author Sean A. Irvine
 */
public class A059358 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.sigma(3).add(fs.sigma2().multiply(3)).add(fs.sigma().multiply2()).divide(6);
  }
}
