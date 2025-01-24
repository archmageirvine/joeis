package irvine.oeis.a074;

import irvine.oeis.DifferenceSequence;

/**
 * A074659 First differences of A074658, which counts the convex partitions of n.
 * @author Sean A. Irvine
 */
public class A074659 extends DifferenceSequence {

  /** Construct the sequence. */
  public A074659() {
    super(0, new A074658());
  }
}
