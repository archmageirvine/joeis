package irvine.oeis.a073;

import irvine.oeis.FiniteSequence;

/**
 * A073608 a(1) = 1, a(n) = smallest number such that a(n) - a(n-k) is a prime power &gt; 1 for all k.
 * @author Georg Fischer
 */
public class A073608 extends FiniteSequence {

  /** Construct the sequence. */
  public A073608() {
    super(1, FINITE, 1, 3, 5, 8, 10, 12);
  }
}
