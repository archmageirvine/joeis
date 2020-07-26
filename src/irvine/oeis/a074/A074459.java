package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074459 Number of segments which change from display of a number n to the next number <code>n+1</code> on a 7-segment display: version where <code>'6', '7', '9'</code> use <code>6, 4</code>, resp. 5 segments.
 * @author Georg Fischer
 */
public class A074459 extends FiniteSequence {

  /** Construct the sequence. */
  public A074459() {
    super(4, 5, 2, 3, 3, 1, 4, 3, 2);
  }
}
