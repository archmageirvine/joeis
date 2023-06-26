package irvine.oeis.a250;

import irvine.oeis.FiniteSequence;

/**
 * A250173 Primes with distinct digits: a(n) is the least prime &gt; a(n-1) such that a(n-1) and a(n) share no common digit.
 * @author Georg Fischer
 */
public class A250173 extends FiniteSequence {

  /** Construct the sequence. */
  public A250173() {
    super(1, FINITE, 2, 5, 7, 13, 29, 31, 47, 53, 61, 73, 89, 103, 257, 349, 521, 607, 821, 907, 1283, 4057, 6329, 7451, 8039, 12457, 30689, 41257, 63809, 74521, 80369);
  }
}
