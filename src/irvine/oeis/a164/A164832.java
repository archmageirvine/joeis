package irvine.oeis.a164;

import irvine.oeis.FiniteSequence;

/**
 * A164832 Least nonnegative integer k such that the decimal representations of k and <code>k+1</code> have n distinct digits in common.
 * @author Georg Fischer
 */
public class A164832 extends FiniteSequence {

  /** Construct the sequence. */
  public A164832() {
    super(0, 10, 100, 1020, 10230, 102340, 1023450, 10234560, 102345670L, 1023456780L, 10234567889L);
  }
}
