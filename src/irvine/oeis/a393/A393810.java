package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A393810 Expansion of 2F1(1/6, 1/2; 1/2; 27*x/(1-4*x)^3)^2.
 * @author Georg Fischer
 */
public class A393810 extends GfSequence {

  /** Construct the sequence. */
  public A393810() {
    super(0, SQ.square(Hypergeometric.s(new Q[] {new Q(1, 6), Q.HALF}, new Q[] {Q.HALF}, SeriesParser.parse("27*x/(1-4*x)^3"))));
  }
}
