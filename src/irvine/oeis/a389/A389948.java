package irvine.oeis.a389;

import irvine.oeis.InterleaveSequence;

/**
 * A389948 Shell enumeration of the upper halfplane. Terms are interleaved x and y coordinates.
 * @author Sean A. Irvine
 */
public class A389948 extends InterleaveSequence {

  /** Construct the sequence. */
  public A389948() {
    super(1, new A389649(), new A389648());
  }
}

