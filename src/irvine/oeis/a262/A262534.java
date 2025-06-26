package irvine.oeis.a262;

import irvine.oeis.FiniteSequence;

/**
 * A262534 Numbers k such that phi(k-2) = phi(k-1) = (k-1) / 2.
 * @author Georg Fischer
 */
public class A262534 extends FiniteSequence {

  /** Construct the sequence. */
  public A262534() {
    super(1, FINITE, 3, 5, 17, 257, 65537, 4294967297L);
  }
}
