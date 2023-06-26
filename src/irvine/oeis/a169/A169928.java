package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169928 Values of n &gt;= 7 such that 10*n-122+360/n is an integer.
 * @author Georg Fischer
 */
public class A169928 extends FiniteSequence {

  /** Construct the sequence. */
  public A169928() {
    super(1, FINITE, 8, 9, 10, 12, 15, 18, 20, 24, 30, 36, 40, 45, 60, 72, 90, 120, 180, 360);
  }
}
