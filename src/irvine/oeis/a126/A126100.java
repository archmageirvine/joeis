package irvine.oeis.a126;

import irvine.math.series.Series;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000666;
import irvine.oeis.gf.GfSequence;

/**
 * A126100 Number of rooted connected unlabeled graphs on n nodes.
 * @author Gregory Morse
 */
public class A126100 extends GfSequence {
  /** Construct the sequence. */
  public A126100() {
    super(0, SQ.shift(SQ.divide(Series.create(new A000666()), Series.create(new A000088())), 1));
  }
}
