package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023888 Sum of prime power divisors of <code>n (1</code> included).
 * @author Sean A. Irvine
 */
public class A023888 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
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

