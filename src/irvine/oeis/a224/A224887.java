package irvine.oeis.a224;

import irvine.oeis.FiniteSequence;

/**
 * A224887 Honaker trios: Consecutive prime numbers p <code>&lt; q &lt</code>; r such that p <code>| (qr+1)</code>.
 * @author Georg Fischer
 */
public class A224887 extends FiniteSequence {

  /** Construct the sequence. */
  public A224887() {
    super(2, 3, 5, 3, 5, 7, 61, 67, 71);
  }
}
