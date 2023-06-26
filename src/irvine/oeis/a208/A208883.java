package irvine.oeis.a208;

import irvine.oeis.FiniteSequence;

/**
 * A208883 Numbers n such that n == 1 (mod 4), n != 2, and |x^2+x-n| is 1 or a prime for all x in {1,...,sqrt(n)}.
 * @author Georg Fischer
 */
public class A208883 extends FiniteSequence {

  /** Construct the sequence. */
  public A208883() {
    super(1, FINITE, 5, 13, 17, 21, 29, 37, 53, 77, 101, 173, 197, 293, 437, 677);
  }
}
