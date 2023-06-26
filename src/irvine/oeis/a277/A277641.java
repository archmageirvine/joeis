package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277641 Numbers k &gt; 2 such that the Diophantine equation x^2 + 2^a * 5^b * 13^c = y^k has one or more solutions for nonnegative a, b, c with x, y &gt; 0 and gcd(x, y) = 1.
 * @author Georg Fischer
 */
public class A277641 extends FiniteSequence {

  /** Construct the sequence. */
  public A277641() {
    super(1, FINITE, 3, 4, 5, 6, 7, 8, 12);
  }
}
