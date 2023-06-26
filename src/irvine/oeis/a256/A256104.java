package irvine.oeis.a256;

import irvine.oeis.FiniteSequence;

/**
 * A256104 Differential autobiographical numbers: number n = x0 x1 x2 ... x9 such that xi is the number of pairs (xj, xk), j different from k, where |xj - xk| = i.
 * @author Georg Fischer
 */
public class A256104 extends FiniteSequence {

  /** Construct the sequence. */
  public A256104() {
    super(1, FINITE, 20404, 31330);
  }
}
