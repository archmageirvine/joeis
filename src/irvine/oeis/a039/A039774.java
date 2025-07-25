package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039774 Numbers k such that phi(k) is equal to the product of (the sum of prime factors and the sum of exponents) of k-1.
 * @author Sean A. Irvine
 */
public class A039774 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(mN);
      final long phi = Functions.PHI.l(++mN);
      long s1 = 0;
      long s2 = 0;
      for (final Z p : fs.toZArray()) {
        s1 += p.longValue();
        s2 += fs.getExponent(p);
      }
      if (s1 * s2 == phi) {
        return Z.valueOf(mN);
      }
    }
  }
}
