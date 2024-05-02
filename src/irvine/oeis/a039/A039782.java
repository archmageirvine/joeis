package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039782 phi(n) is equal to the sum of the prime-power components of n-1.
 * @author Sean A. Irvine
 */
public class A039782 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(mN);
      final Z phi = Functions.PHI.z(++mN);
      Z sum = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        sum = sum.add(p.pow(fs.getExponent(p)));
      }
      if (sum.equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
