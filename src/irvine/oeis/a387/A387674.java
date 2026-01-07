package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.SeriesRing;
import irvine.oeis.gf.GfSequence;

/**
 * A387674 Expansion of g.f. (Sum_{i&gt;=0} (i!-1)*x^i)/(Sum_{i&gt;=0} i!*x^i).
 * @author Sean A. Irvine
 */
public class A387674 extends GfSequence {

  /** Construct the sequence. */
  public A387674() {
    super(0, SeriesRing.SQ.divide(
      new AbstractInfiniteSeries<>() {
        @Override
        public Q coeff(final int n) {
          return Q.valueOf(Functions.FACTORIAL.z(n).subtract(1));
        }
      },
      new AbstractInfiniteSeries<>() {
        @Override
        public Q coeff(final int n) {
          return Q.valueOf(Functions.FACTORIAL.z(n));
        }
      }
    ));
  }
}
