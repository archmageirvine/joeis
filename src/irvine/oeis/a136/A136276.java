package irvine.oeis.a136;

import irvine.oeis.FiniteSequence;

/**
 * A136276 Consider pairs of nonnegative integers (m,k) such that <code>2^2 + 4^2 + 6^2 + ... +</code> (2m)^2 <code>= k(k+1)</code>; sequence gives k values.
 * @author Georg Fischer
 */
public class A136276 extends FiniteSequence {

  /** Construct the sequence. */
  public A136276() {
    super(0, 4, 7, 84);
  }
}
