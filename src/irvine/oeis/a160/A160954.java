package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160954 <code>a(n+1)</code> is the smallest prime formed by appending a single digit to <code>a(n)</code>; <code>a(1)=18</code>.
 * @author Georg Fischer
 */
public class A160954 extends FiniteSequence {

  /** Construct the sequence. */
  public A160954() {
    super(18, 181, 1811, 18119, 181193, 1811939);
  }
}
