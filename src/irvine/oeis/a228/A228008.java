package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228008 The smallest n-digit number where first k digits are divisible by <code>k^2</code> for <code>k = 1..n</code>.
 * @author Georg Fischer
 */
public class A228008 extends FiniteSequence {

  /** Construct the sequence. */
  public A228008() {
    super(1, 12, 126, 1264, 24325, 243252, 6480005);
  }
}
