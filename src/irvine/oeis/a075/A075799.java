package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a030.A030229;

/**
 * A075799 Palindromic numbers which are products of an even number of distinct primes.
 * @author Sean A. Irvine
 */
public class A075799 extends FilterSequence {

  /** Construct the sequence. */
  public A075799() {
    super(new A030229(), PALINDROME);
  }
}
