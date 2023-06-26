package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160955 a(n+1) is the largest prime formed by appending a single digit to a(n); a(1)=18.
 * @author Georg Fischer
 */
public class A160955 extends FiniteSequence {

  /** Construct the sequence. */
  public A160955() {
    super(1, FINITE, 18, 181, 1811, 18119, 181199, 1811993);
  }
}
