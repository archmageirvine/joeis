package irvine.oeis.a002;

import irvine.oeis.FilterSequence;

/**
 * A002385 Palindromic primes: prime numbers whose decimal expansion is a palindrome.
 * @author Sean A. Irvine
 */
public class A002385 extends FilterSequence {

  /** Construct the sequence. */
  public A002385() {
    super(1, new A002113(), PRIME);
  }
}
