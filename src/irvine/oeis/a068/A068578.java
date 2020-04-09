package irvine.oeis.a068;

import irvine.oeis.FiniteSequence;

/**
 * A068578 Numbers k such that <code>tau(k)*sigma(k) &gt; k*phi(k)</code>.
 * @author Georg Fischer
 */
public class A068578 extends FiniteSequence {

  /** Construct the sequence. */
  public A068578() {
    super(2, 3, 4, 6, 8, 10, 12, 14, 16, 18, 20, 24, 30, 36, 40, 42, 48, 60, 72, 84, 90, 120, 180);
  }
}
