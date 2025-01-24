package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074692 1 + n-th prime is harmonic.
 * @author Sean A. Irvine
 */
public class A074692 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p1 = super.next().add(1);
      final FactorSequence fs = Jaguar.factor(p1);
      if (fs.sigma0().multiply(p1).mod(fs.sigma()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
