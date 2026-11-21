package irvine.oeis.a126;

import irvine.math.series.Series;
import irvine.oeis.a339.A339064;
import irvine.oeis.gf.GfSequence;

/**
 * A126133 Number of edge-rooted unlabeled graphs with n edges.
 * @author Gregory Morse
 */
public class A126133 extends GfSequence {
  /** Construct the sequence. */
  public A126133() {
    super(1, SQ.shift(SQ.divide(Series.create(new A339064()), SQ.add(SQ.one(), SQ.x())), 1));
  }
}
