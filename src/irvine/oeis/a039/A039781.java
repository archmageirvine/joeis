package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039781 Numbers k such that phi(k) is equal to A008473(k+1).
 * @author Sean A. Irvine
 */
public class A039781 extends Sequence1 {

  private long mN = 54;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      final FactorSequence fs = Jaguar.factor(mN + 1);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(p.add(fs.getExponent(p)));
      }
      if (prod.equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
