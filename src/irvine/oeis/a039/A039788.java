package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039788 phi(a(n)) is equal to the product of (the sum of prime factors and the sum of exponents) of (a(n)).
 * @author Sean A. Irvine
 */
public class A039788 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
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
