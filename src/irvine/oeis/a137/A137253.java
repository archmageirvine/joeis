package irvine.oeis.a137;

import irvine.oeis.FiniteSequence;

/**
 * A137253 Semiprimes (A001358) which are not the sum of two semiprimes.
 * @author Georg Fischer
 */
public class A137253 extends FiniteSequence {

  /** Construct the sequence. */
  public A137253() {
    super(1, FINITE, 4, 6, 9, 22, 33);
  }
}
