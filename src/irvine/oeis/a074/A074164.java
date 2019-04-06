package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074164 Smallest k such that R(k) &gt; n*k, where R(k) is the digit reversal of k (A004086) (the reversal of 10 is taken to be 01 = 1, etc.).
 * @author Georg Fischer
 */
public class A074164 extends FiniteSequence {

  /** Construct the sequence. */
  public A074164() {
    super(12, 13, 15, 17, 106, 107, 108, 109, 1099);
  }
}
