package irvine.oeis.a361;

import irvine.oeis.FiniteSequence;

/**
 * A361898 A set of 13 primes that form a covering set for a Sierpi\u0144ski (or Riesel) number.
 * @author Sean A. Irvine
 */
public class A361898 extends FiniteSequence {

  /** Construct the sequence. */
  public A361898() {
    super(1, FINITE, 3, 5, 7, 11, 31, 73, 97, 151, 241, 631, 673, 1321, 23311);
  }
}
