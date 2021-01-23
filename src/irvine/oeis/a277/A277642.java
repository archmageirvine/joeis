package irvine.oeis.a277;

import irvine.oeis.FiniteSequence;

/**
 * A277642 Number of solutions of the Diophantine equation x^2 + 2^a * 5^b * 13^c = y^A277641(n) for nonnegative a, b, c with x, y &gt; 0 and gcd(x, y) = 1.
 * @author Georg Fischer
 */
public class A277642 extends FiniteSequence {

  /** Construct the sequence. */
  public A277642() {
    super(38, 10, 1, 4, 1, 2, 1);
  }
}
