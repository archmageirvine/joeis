package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160751 a(n) is the smallest n-digit prime formed by appending a digit to a(n-1); a(1)=6.
 * @author Georg Fischer
 */
public class A160751 extends FiniteSequence {

  /** Construct the sequence. */
  public A160751() {
    super(1, FINITE, 6, 61, 613, 6131);
  }
}
