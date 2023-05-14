package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063744 a(n) = sigma(a(n-1)) * number of divisors of a(n-1), a(1)=2.
 * @author Sean A. Irvine
 */
public class A063744 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final FactorSequence fs = Jaguar.factor(mA);
      mA = fs.sigma().multiply(fs.sigma0());
    }
    return mA;
  }
}

