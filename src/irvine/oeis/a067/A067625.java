package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067625 Numbers n such that sigma(n) = phi(prime(n)+1).
 * @author Sean A. Irvine
 */
public class A067625 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(Functions.PHI.z(super.next().add(1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
