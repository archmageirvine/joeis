package irvine.oeis.a301;

import irvine.oeis.FiniteSequence;

/**
 * A301515 Complete list of integers x &gt; 1 such that x^2 - x = y^q - y, where q is an odd prime and y is a prime power.
 * @author Georg Fischer
 */
public class A301515 extends FiniteSequence {

  /** Construct the sequence. */
  public A301515() {
    super(3, 6, 16, 91, 280);
  }
}
