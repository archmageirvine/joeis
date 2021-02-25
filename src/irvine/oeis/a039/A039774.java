package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039774 phi(a(n)) is equal to the product of (the sum of prime factors and the sum of exponents) of (a(n)-1).
 * @author Sean A. Irvine
 */
public class A039774 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(mN);
      final long phi = Cheetah.factor(++mN).phi().longValueExact();
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
