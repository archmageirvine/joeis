package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277642 Number of solutions of the Diophantine equation <code>x^2 + 2^a *</code> 5^b * 13^c = y^A277641(n) for nonnegative <code>a,</code> b, c with <code>x,</code> y <code>&gt; 0</code> and gcd(x, y) <code>= 1</code>.
 * @author Georg Fischer
 */
public class A277642 extends FiniteSequence {

  /** Construct the sequence. */
  public A277642() {
    super(38, 10, 1, 4, 1, 2, 1);
  }
}
