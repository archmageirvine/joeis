package irvine.oeis.a161;

import irvine.oeis.FiniteSequence;

/**
 * A161562 Even numbers n such that { n-p ; p prime, 2 &lt; p &lt; n/2 } contains at least twice as many primes as composites.
 * @author Georg Fischer
 */
public class A161562 extends FiniteSequence {

  /** Construct the sequence. */
  public A161562() {
    super(1, FINITE, 2, 4, 6, 8, 10, 16, 18, 20, 22, 24, 36, 60, 84, 90, 114, 120, 210, 420);
  }
}
