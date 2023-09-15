package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A065772 Nontrivial prime powers n from A025475 such that tau[n^2] is prime but sigma[n^2] is a composite number.
 * @author Sean A. Irvine
 */
public class A065772 extends A025475 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      final FactorSequence fs = Jaguar.factor(pp.square());
      if (fs.sigma0().isProbablePrime() && !fs.sigma().isProbablePrime()) {
        return pp;
      }
    }
  }
}
