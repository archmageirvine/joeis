package irvine.oeis.a210;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A210913 Number of transitive reflexive early confluent binary relations R on n labeled elements where |{y : xRy}| &lt;= 5 for all x.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A210913 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A210913() {
    super(0);
  }

  private final MemoryFactorial mFactorial = MemoryFactorial.SINGLETON;
  protected MemoryFunction2<Integer, Polynomial<Q>> mT = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Q> compute(final Integer k, final Integer n) {
      if (k < 0) {
        return RING.zero();
      }
      Polynomial<Q> sum = RING.zero();
      for (int m = 1; m <= k; ++m) {
        sum = RING.add(sum, RING.divide(get(k - m, n), new Q(mFactorial.factorial(m))).shift(m));
      }
      return RING.exp(sum.truncate(n), n);
    }
  };

  @Override
  public Polynomial<Q> compute(final int n) {
    return mT.get(5, n);
  }
}
