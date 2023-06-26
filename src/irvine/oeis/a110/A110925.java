package irvine.oeis.a110;

import irvine.oeis.FiniteSequence;

/**
 * A110925 a(1) = 1; for n&gt;1, a(n) is the smallest positive integer such that the continued fraction [a(1),a(2),a(3),...,a(n)] has numerator divisible by n.
 * @author Georg Fischer
 */
public class A110925 extends FiniteSequence {

  /** Construct the sequence. */
  public A110925() {
    super(1, FINITE, 1, 1, 1, 2, 4, 2, 7, 2, 7, 10, 5, 10, 4, 2, 7, 2, 9);
  }
}
