package irvine.oeis.a074;

import irvine.oeis.FiniteSequence;

/**
 * A074163 Smallest k, not divisible by 10, such that R(k) &gt; n*k, where R(k) is the digit reversal of k (A004086).
 * @author Georg Fischer
 */
public class A074163 extends FiniteSequence {

  /** Construct the sequence. */
  public A074163() {
    super(1, FINITE, 12, 13, 15, 17, 19, 107, 108, 109);
  }
}
