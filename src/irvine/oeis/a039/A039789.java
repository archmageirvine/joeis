package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039789 Integers k such that phi(k) is equal to the product of (the sum of prime factors and the sum of exponents) of k+1.
 * @author Sean A. Irvine
 */
public class A039789 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Functions.PHI.z(++mN);
      final FactorSequence fs = Jaguar.factor(mN + 1);
      long s1 = 0;
      long s2 = 0;
      for (final Z p : fs.toZArray()) {
        s1 += p.longValue();
        s2 += fs.getExponent(p);
      }
      if (phi.equals(Z.valueOf(s1).multiply(s2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
