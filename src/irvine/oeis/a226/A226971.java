package irvine.oeis.a226;

import irvine.oeis.FiniteSequence;

/**
 * A226971 Numbers k such that the sum of digits of <code>k^7</code> is equal to k.
 * @author Georg Fischer
 */
public class A226971 extends FiniteSequence {

  /** Construct the sequence. */
  public A226971() {
    super(0, 1, 18, 27, 31, 34, 43, 53, 58, 68);
  }
}
