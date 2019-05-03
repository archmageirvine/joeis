package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277641 Numbers k <code>&gt; 2</code> such that the Diophantine equation <code>x^2 + 2^a * 5^b * 13^c = y^k</code> has one or more solutions for nonnegative a, b, c with x, <code>y &gt; 0</code> and <code>gcd(x, y) = 1</code>.
 * @author Georg Fischer
 */
public class A277641 extends FiniteSequence {

  /** Construct the sequence. */
  public A277641() {
    super(3, 4, 5, 6, 7, 8, 12);
  }
}
