package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160954 a(n+1) is the smallest prime formed by appending a single digit to a(n); a(1)=18.
 * @author Georg Fischer
 */
public class A160954 extends FiniteSequence {

  /** Construct the sequence. */
  public A160954() {
    super(1, FINITE, 18, 181, 1811, 18119, 181193, 1811939);
  }
}
