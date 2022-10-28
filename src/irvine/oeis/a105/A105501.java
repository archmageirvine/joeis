package irvine.oeis.a105;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A105501 Numbers n such that 1 is the leading digit of the n-th Fibonacci number in decimal representation.
 * @author Georg Fischer
 */
public class A105501 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A105501() {
    this('1');
  }

  /**
   * Generic constructor with parameter.
   * @param digit the leading digit
   */
  public A105501(final char digit) {
    super(1, 0, new A000045(), k -> k.toString().charAt(0) == digit);
  }
}
