package irvine.oeis.a303;

import irvine.math.series.Series;
import irvine.oeis.PrependSequence;
import irvine.oeis.a126.A126133;
import irvine.oeis.a339.A339063;
import irvine.oeis.gf.GfSequence;

/**
 * A303832 The number of edge-rooted unlabeled connected graphs with n edges.
 * @author Gregory Morse
 */
public class A303832 extends GfSequence {
  /** Construct the sequence. */
  public A303832() {
    super(1, SQ.divide(Series.create(new PrependSequence(0, new A126133(), 0)), Series.create(new A339063().unrooted())));
  }
}
