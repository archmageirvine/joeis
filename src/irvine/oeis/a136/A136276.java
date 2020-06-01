package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136276 Consider pairs of nonnegative integers <code>(m,k)</code> such that <code>2^2 + 4^2 + 6^2 + ... + (2m)^2 = k(k+1);</code> sequence gives k values.
 * @author Georg Fischer
 */
public class A136276 extends FiniteSequence {

  /** Construct the sequence. */
  public A136276() {
    super(0, 4, 7, 84);
  }
}
