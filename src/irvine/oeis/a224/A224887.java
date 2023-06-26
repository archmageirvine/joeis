package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224887 Honaker trios: Consecutive prime numbers p &lt; q &lt; r such that p | (qr+1).
 * @author Georg Fischer
 */
public class A224887 extends FiniteSequence {

  /** Construct the sequence. */
  public A224887() {
    super(1, FINITE, 2, 3, 5, 3, 5, 7, 61, 67, 71);
  }
}
