package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039773 phi(n) is equal to the sum of prime factors and exponents of n-1.
 * @author Sean A. Irvine
 */
public class A039773 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(mN);
      final long phi = Jaguar.factor(++mN).phi().longValueExact();
      long s = 0;
      for (final Z p : fs.toZArray()) {
        s += p.longValue();
        s += fs.getExponent(p);
      }
      if (s == phi) {
        return Z.valueOf(mN);
      }
    }
  }
}
