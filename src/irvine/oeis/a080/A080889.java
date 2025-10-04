package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A080889 Expansion of 1/Sum_{k&gt;=0} (-x)^Fibonacci(k).
 * @author Sean A. Irvine
 */
public class A080889 extends GfSequence {

  /** Construct the sequence. */
  public A080889() {
    super(0, SeriesRing.SQ.divide(SeriesRing.SQ.one(), new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final int n) {
        if (n == 1) {
          return Q.valueOf(-2); // F(1)=F(2)=1
        }
        return Predicates.FIBONACCI.is(n) ? Q.NEG_ONE.pow(n) : Q.ZERO;
      }
    }));
  }
}

