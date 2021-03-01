package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039781 Numbers k such that phi(k) is equal to A008473(k+1).
 * @author Sean A. Irvine
 */
public class A039781 implements Sequence {

  private long mN = 54;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Cheetah.factor(++mN).phi();
      final FactorSequence fs = Cheetah.factor(mN + 1);
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
