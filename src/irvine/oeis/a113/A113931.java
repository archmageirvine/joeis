package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113931 (RSA-1536)-10^n = prime where RSA-1536 is the 463 decimal digit unfactored RSA challenge number.
 * @author Georg Fischer
 */
public class A113931 extends FiniteSequence {

  /** Construct the sequence. */
  public A113931() {
    super(1, FINITE, 84, 99, 564);
  }
}
