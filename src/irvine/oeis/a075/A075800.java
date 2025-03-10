package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a030.A030059;

/**
 * A075800 Palindromic numbers which are products of an odd number of distinct primes.
 * @author Sean A. Irvine
 */
public class A075800 extends FilterSequence {

  /** Construct the sequence. */
  public A075800() {
    super(new A030059(), PALINDROME);
  }
}
