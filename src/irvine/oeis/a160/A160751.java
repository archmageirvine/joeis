package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160751 <code>a(n)</code> is the smallest n-digit prime formed by appending a digit to <code>a(n-1); a(1)=6</code>.
 * @author Georg Fischer
 */
public class A160751 extends FiniteSequence {

  /** Construct the sequence. */
  public A160751() {
    super(6, 61, 613, 6131);
  }
}
