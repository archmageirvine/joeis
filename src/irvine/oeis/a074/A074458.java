package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074458 Number of segments lit to display the number n on a 7-segment display (as in pocket <code>calculators)</code>: variant where <code>'6', '7'</code> and <code>'9'</code> use <code>6, 4</code> resp. 5 segments.
 * @author Georg Fischer
 */
public class A074458 extends FiniteSequence {

  /** Construct the sequence. */
  public A074458() {
    super(6, 2, 5, 5, 4, 5, 6, 4, 7, 5);
  }
}
