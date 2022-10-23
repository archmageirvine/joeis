package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053784 Harmonic means of (1+e)-divisors of (1+e)-harmonic numbers.
 * @author Sean A. Irvine
 */
public class A053784 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Q prod = Q.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(A053783.f(p, fs.getExponent(p)));
      }
      prod = prod.multiply(mN);
      if (prod.isInteger()) {
        return prod.toZ();
      }
    }
  }
}
