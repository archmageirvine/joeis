package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074660 Second differences of A074658, which counts the convex partitions of n.
 * @author Sean A. Irvine
 */
public class A074660 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074660() {
    super(0, new A074659());
  }
}
