package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A065771 Prime powers n such that both tau(n^2) and sigma(n^2) are composite numbers.
 * @author Sean A. Irvine
 */
public class A065771 extends A025475 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      final FactorSequence fs = Jaguar.factor(pp.square());
      if (!fs.sigma0().isProbablePrime() && !fs.sigma().isProbablePrime()) {
        return pp;
      }
    }
  }
}
