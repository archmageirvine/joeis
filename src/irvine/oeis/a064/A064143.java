package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A064143 Sum of unitary prime divisors (A056169, A034444) of central binomial coefficient C(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A064143 extends A001405 {

  /** Construct the sequence. */
  public A064143() {
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
      if (fs.getExponent(p) == 1) {
        sum = sum.add(p);
      }
    }
    return sum;
  }
}
