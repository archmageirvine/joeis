package irvine.oeis.a064;

import irvine.oeis.FiniteSequence;

/**
 * A064374 Numbers k such that sigma(k) &gt; phi(k)^2.
 * @author Georg Fischer
 */
public class A064374 extends FiniteSequence {

  /** Construct the sequence. */
  public A064374() {
    super(1, FINITE, 2, 4, 6, 10, 12, 18, 30);
  }
}
