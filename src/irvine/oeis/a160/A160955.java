package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160955 <code>a(n+1)</code> is the largest prime formed by appending a single digit to <code>a(n)</code>; <code>a(1)=18</code>.
 * @author Georg Fischer
 */
public class A160955 extends FiniteSequence {

  /** Construct the sequence. */
  public A160955() {
    super(18, 181, 1811, 18119, 181199, 1811993);
  }
}
