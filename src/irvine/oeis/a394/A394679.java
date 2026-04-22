package irvine.oeis.a394;

import irvine.math.q.Q;
import irvine.math.series.Hypergeometric;
import irvine.math.series.SeriesParser;
import irvine.oeis.gf.GfSequence;

/**
 * A394679 Expansion of 2F1(1/4, 3/4; 1/2; 4*x/(1-x)^2)^2.
 * @author Georg Fischer
 */
public class A394679 extends GfSequence {

  /** Construct the sequence. */
  public A394679() {
    super(0, SQ.square(Hypergeometric.s(new Q[] {new Q(1, 4), new Q(3, 4)}, new Q[] {Q.HALF}, SeriesParser.parse("4*x/(1-x)^2"))));
  }
}
