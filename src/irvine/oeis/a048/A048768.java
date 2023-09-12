package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048768 Numbers n such that A048767(n) = n.
 * @author Sean A. Irvine
 */
public class A048768 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      Z prod = Z.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(Puma.primeZ(fs.getExponent(p)).pow(Puma.primePi(p)));
      }
      if (prod.equals(mN)) {
        return mN;
      }
    }
  }
}
