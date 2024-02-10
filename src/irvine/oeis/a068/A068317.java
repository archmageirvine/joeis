package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068308.
 * @author Sean A. Irvine
 */
public class A068317 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(mN).compareTo(p.multiply(fs.omega())) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
