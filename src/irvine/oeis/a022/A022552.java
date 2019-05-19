package irvine.oeis.a022;

import irvine.oeis.ComplementSequence;

/**
 * A022552 Numbers that are not the sum of 2 squares and a nonnegative cube.
 * @author Sean A. Irvine
 */
public class A022552 extends ComplementSequence {

  /** Construct the sequence. */
  public A022552() {
    super(new A022551());
  }
}

