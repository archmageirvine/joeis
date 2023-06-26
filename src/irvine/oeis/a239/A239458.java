package irvine.oeis.a239;

import irvine.oeis.FiniteSequence;

/**
 * A239458 Define a sequence b(n) such that b(k) is the smallest integer greater than b(k-1) and relatively prime to the product b(0)*b(1)*...b(k-1). The current sequence lists the starting b(0)'s such that all b(k), for k&gt;= 1, are primes or powers of primes.
 * @author Georg Fischer
 */
public class A239458 extends FiniteSequence {

  /** Construct the sequence. */
  public A239458() {
    super(1, FINITE, 3, 4, 6, 7, 8, 12, 15, 18, 22, 24, 30, 70);
  }
}
