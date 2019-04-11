package irvine.oeis.a239;

import irvine.oeis.FiniteSequence;

/**
 * A239458 Define a sequence <code>b(n)</code> such that <code>b(k)</code> is the smallest integer greater than <code>b(k-1)</code> and relatively prime to the product <code>b(0)*b(1)*...b(k-1).</code> The current sequence lists the starting b(0)'s such that all <code>b(k),</code> for <code>k&gt;= 1,</code> are primes or powers of primes.
 * @author Georg Fischer
 */
public class A239458 extends FiniteSequence {

  /** Construct the sequence. */
  public A239458() {
    super(3, 4, 6, 7, 8, 12, 15, 18, 22, 24, 30, 70);
  }
}
