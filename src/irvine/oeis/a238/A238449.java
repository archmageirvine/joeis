package irvine.oeis.a238;

import irvine.oeis.FiniteSequence;

/**
 * A238449 Smallest numbers m such that 2^m contains a string of n consecutive decreasing integers in its decimal representation.
 * @author Georg Fischer
 */
public class A238449 extends FiniteSequence {

  /** Construct the sequence. */
  public A238449() {
    super(1, FINITE, 0, 5, 25, 78, 161, 341, 1315, 28238, 56047, 283789);
  }
}
