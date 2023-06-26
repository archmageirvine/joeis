package irvine.oeis.a046;

import irvine.oeis.FiniteSequence;

/**
 * A046458 Positive even integers that are not the sum of two nonprime odd integers.
 * @author Georg Fischer
 */
public class A046458 extends FiniteSequence {

  /** Construct the sequence. */
  public A046458() {
    super(1, FINITE, 4, 6, 8, 12, 14, 20, 32, 38);
  }
}
