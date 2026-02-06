package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.EgfSequence;

/**
 * A392981 Expansion of e.g.f. 1 / (1 - Sum_{k&gt;=1} Fibonacci(k+1)*x^k/k!).
 * @author Sean A. Irvine
 */
public class A392981 extends EgfSequence {

  /** Construct the sequence. */
  public A392981() {
    super(0, SeriesRing.SQ.divide(SeriesRing.SQ.one(), new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final int n) {
        return n == 0 ? Q.ONE : new Q(Functions.FIBONACCI.z(n + 1).negate(), Functions.FACTORIAL.z(n));
      }
    }));
  }
}

