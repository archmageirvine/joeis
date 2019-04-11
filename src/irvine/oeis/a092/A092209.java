package irvine.oeis.a092;

import irvine.oeis.FiniteSequence;

/**
 * A092209 Smallest number k such that <code>k, k+2, k+4, ..., k+2n</code> are semiprimes.
 * @author Georg Fischer
 */
public class A092209 extends FiniteSequence {

  /** Construct the sequence. */
  public A092209() {
    super(4, 4, 91, 213, 213, 1383, 3091, 8129);
  }
}
