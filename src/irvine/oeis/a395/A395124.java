package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A395124 Expansion of 2F1(1/3, 2/3; 1; 27*x/(1-4*x)^3)^2.
 * @author Georg Fischer
 */
public class A395124 extends GfSequence {

  /** Construct the sequence. */
  public A395124() {
    super(0, SQ.square(Hypergeometric.s(new Q[] {Q.ONE_THIRD, new Q(2, 3)}, new Q[] {Q.ONE}, SeriesParser.parse("27*x/(1-4*x)^3"))));
  }
}
