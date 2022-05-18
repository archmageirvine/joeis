package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050704 Composite numbers k with the property that k minus the sum of the prime factors of k is prime.
 * @author Sean A. Irvine
 */
public class A050704 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      Z sum = Z.valueOf(++mN);
      final FactorSequence fs = Jaguar.factor(mN);
      for (final Z p : fs.toZArray()) {
        sum = sum.subtract(p.multiply(fs.getExponent(p)));
      }
      if (sum.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
