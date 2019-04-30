package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277642 Number of solutions of the Diophantine equation <code>x^2 + 2^a * 5^b *</code> 13^c = y^A277641(n) for nonnegative <code>a, b</code>, c with <code>x, y &gt; 0</code> and <code>gcd(x, y) = 1</code>.
 * @author Georg Fischer
 */
public class A277642 extends FiniteSequence {

  /** Construct the sequence. */
  public A277642() {
    super(38, 10, 1, 4, 1, 2, 1);
  }
}
