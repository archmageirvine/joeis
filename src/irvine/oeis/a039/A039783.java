package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039783 phi(n) is equal to the product of the dual prime-power components of n-1 (i.e., A008477(n-1)).
 * @author Sean A. Irvine
 */
public class A039783 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(mN);
      final Z phi = Cheetah.factor(++mN).phi();
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(Z.valueOf(fs.getExponent(p)).pow(p));
      }
      if (prod.equals(phi)) {
        return Z.valueOf(mN);
      }
    }
  }
}
