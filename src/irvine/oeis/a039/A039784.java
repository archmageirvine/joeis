package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039784 phi(n) is equal to the product of the dual prime-power components of n.
 * @author Sean A. Irvine
 */
public class A039784 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(Z.valueOf(fs.getExponent(p)).pow(p));
      }
      if (prod.equals(fs.phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}
