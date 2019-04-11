package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228007 The largest n-digit number where first k digits are divisible by <code>k^2</code> for <code>k = 1..n</code>.
 * @author Georg Fischer
 */
public class A228007 extends FiniteSequence {

  /** Construct the sequence. */
  public A228007() {
    super(9, 96, 963, 9632, 96325, 963252, 6480005);
  }
}
