package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169922 Values of n &gt;= 0 such that 3*n-36+360/(n+10) is an integer.
 * @author Georg Fischer
 */
public class A169922 extends FiniteSequence {

  /** Construct the sequence. */
  public A169922() {
    super(0, 2, 5, 8, 10, 14, 20, 26, 30, 35, 50, 62, 80, 110, 170, 350);
  }
}
