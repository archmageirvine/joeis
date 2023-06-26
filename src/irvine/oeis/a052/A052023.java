package irvine.oeis.a052;

import irvine.oeis.FiniteSequence;

/**
 * A052023 Every suffix of palindromic prime a(n), containing no '0' digit, is prime (left-truncatable palindromic primes).
 * @author Georg Fischer
 */
public class A052023 extends FiniteSequence {

  /** Construct the sequence. */
  public A052023() {
    super(1, FINITE, 2, 3, 5, 7, 313, 353, 373, 383, 797, 76367, 79397, 7693967, 799636997L);
  }
}
