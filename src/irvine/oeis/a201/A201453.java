package irvine.oeis.a201;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A201453 Triangle of numerators of dual coefficients of Faulhaber.
 * F(m,k) = (1/(2*m-2*k+1))sum(binomial(m, 2*k-i)*binomial(2*m-2*k+i,i) Bernoulli(i), i=0..2*k)
 * @author Georg Fischer
 */
public class A201453 extends RationalTriangle {

  final BernoulliSequence mB;

  /** Construct the sequence. */
  public A201453() {
    hasRAM(true);
    mB = new BernoulliSequence(0);
  }

  @Override
  public Q compute(final int m, final int k) {
    if (m == 0) {
      return Q.ONE;
    } else {
      Q sum = Q.ZERO;
      for (int i = 0; i <= 2 * k; ++i) {
        sum = sum.add(mB.get(i).multiply(Binomial.binomial(m, 2L * k - i)).multiply(Binomial.binomial(2L * m - 2L * k + i, i)));
      }
      return sum.divide(2L * m - 2L * k + 1);
    }
  }
}
