package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053783 (1+e)-harmonic numbers: harmonic mean of (1+e)-divisors is an integer.
 * @author Sean A. Irvine
 */
public class A053783 extends Sequence1 {

  // After Amiram Eldar

  private long mN = 0;

  static Q f(final Z p, final int e) {
    final FactorSequence fs = Jaguar.factor(e);
    final Z s0 = fs.sigma0().add(1);
    Z sum = p.pow(e);
    for (final Z d : fs.divisors()) {
      sum = sum.add(p.pow(e - d.intValueExact()));
    }
    return new Q(s0, sum);
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Q prod = Q.ONE;
      for (final Z p : fs.toZArray()) {
        prod = prod.multiply(f(p, fs.getExponent(p)));
      }
      if (prod.multiply(mN).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
