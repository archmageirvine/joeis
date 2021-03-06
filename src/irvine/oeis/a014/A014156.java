package irvine.oeis.a014;

import irvine.oeis.ComplementSequence;

/**
 * A014156 Numbers that are not the sum of a nonnegative cube and a triangular number.
 * @author Sean A. Irvine
 */
public class A014156 extends ComplementSequence {

  /** Construct the sequence. */
  public A014156() {
    super(new A014155());
  }
}
