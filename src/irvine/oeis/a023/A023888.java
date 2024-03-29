package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023888 Sum of prime power divisors of n (1 included).
 * @author Sean A. Irvine
 */
public class A023888 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z sum = Z.ONE;
    for (final Z p : fs.toZArray()) {
      Z q = p;
      for (int k = 0; k < fs.getExponent(p); ++k, q = q.multiply(p)) {
        sum = sum.add(q);
      }
    }
    return sum;
  }
}

