package irvine.oeis.a140;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A140173 Numbers n such that <code>sigma(n) = phi(n)*sum</code> of the digits of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A140173 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final FactorSequence fs = Cheetah.factor(mN);
      Z sigma = Z.ZERO;
      for (final Z t : fs.divisors()) {
        sigma = sigma.add(t);
      }
      long digitSum = 0;
      long m = mN;
      while (m != 0) {
        digitSum += m % 10;
        m /= 10;
      }
      Z phi = Z.ONE;
      for (final Z t : fs.toZArray()) {
        phi = phi.multiply(t.pow(fs.getExponent(t) - 1)).multiply(t.subtract(Z.ONE));
      }
      if (phi.multiply(digitSum).equals(sigma)) {
        return Z.valueOf(mN);
      }
    }
  }

}

