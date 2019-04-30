package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277641 Numbers <code>k &gt; 2</code> such that the Diophantine equation <code>x^2 + 2^a * 5^b *</code> 13^c <code>= y^k</code> has one or more solutions for nonnegative <code>a, b</code>, c with <code>x, y &gt; 0</code> and <code>gcd(x, y) = 1</code>.
 * @author Georg Fischer
 */
public class A277641 extends FiniteSequence {

  /** Construct the sequence. */
  public A277641() {
    super(3, 4, 5, 6, 7, 8, 12);
  }
}
