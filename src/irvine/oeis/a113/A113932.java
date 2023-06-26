package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113932 (RSA-2048)-10^n = prime where RSA-2048 is the 617 decimal digit unfactored RSA challenge number.
 * @author Georg Fischer
 */
public class A113932 extends FiniteSequence {

  /** Construct the sequence. */
  public A113932() {
    super(1, FINITE, 107, 848, 871, 966, 1110);
  }
}
