package irvine.oeis.a303;

import irvine.math.series.Series;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a126.A126122;
import irvine.oeis.gf.GfSequence;

/**
 * A303830 The number of edge-rooted unlabeled connected graphs with n nodes.
 * @author Gregory Morse
 */
public class A303830 extends GfSequence {
  protected A303830(final Sequence rooted) {
    // The edge lies in a single connected component.
    super(1, SQ.divide(Series.create(new PrependSequence(0, rooted, 0)), Series.create(new A000088())));
  }

  /** Construct the sequence. */
  public A303830() {
    this(new A126122());
  }
}
