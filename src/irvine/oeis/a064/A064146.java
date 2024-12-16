package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064146 Sum of non-unitary prime divisors of binomial(n,floor(n/2)).
 * @author Sean A. Irvine
 */
public class A064146 extends A001405 {

  /** Construct the sequence. */
  public A064146() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(super.next());
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) != 1) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}
