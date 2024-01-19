package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068005 Numbers n such that n*sigma(n) &gt; phi(n)*prime(n).
 * @author Sean A. Irvine
 */
public class A068005 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().multiply(mN).compareTo(fs.phi().multiply(super.next())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
