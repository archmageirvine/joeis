package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039789 phi(n) is equal to the product of (the sum of prime factors and the sum of exponents) of n+1.
 * @author Sean A. Irvine
 */
public class A039789 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z phi = Cheetah.factor(++mN).phi();
      final FactorSequence fs = Cheetah.factor(mN + 1);
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
