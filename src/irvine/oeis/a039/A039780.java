package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039780 Numbers k such that phi(k) is equal to A008473(k-1).
 * @author Sean A. Irvine
 */
public class A039780 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(mN);
      final Z phi = Jaguar.factor(++mN).phi();
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
