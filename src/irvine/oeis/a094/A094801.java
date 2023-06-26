package irvine.oeis.a094;

import irvine.oeis.FiniteSequence;

/**
 * A094801 Numbers k such that k is a term of A014778, but k-1 and k+1 are not.
 * @author Georg Fischer
 */
public class A094801 extends FiniteSequence {

  /** Construct the sequence. */
  public A094801() {
    super(1, FINITE, 13199998, 117463825L, 513199998L, 1111111110L);
  }
}
