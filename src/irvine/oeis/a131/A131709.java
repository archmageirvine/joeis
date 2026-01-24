package irvine.oeis.a131;

import irvine.oeis.gf.GfSequence;

/**
 * A131709 Number of partitions into "bus routes" of an n X 1 grid.
 * @author Sean A. Irvine
 */
public class A131709 extends GfSequence {

  /** Construct the sequence. */
  public A131709() {
    super(0, "(-1+7*x+10*x^2-20*x^3)/(-1+11*x-20*x^2+10*x^3)");
  }
}
