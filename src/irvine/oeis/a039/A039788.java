package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039788 Numbers k such that phi(k) is equal to the product of (the sum of prime factors and the sum of exponents) of k.
 * @author Sean A. Irvine
 */
public class A039788 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      long s1 = 0;
      long s2 = 0;
      for (final Z p : fs.toZArray()) {
        s1 += p.longValue();
        s2 += fs.getExponent(p);
      }
      if (fs.phi().equals(Z.valueOf(s1).multiply(s2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
