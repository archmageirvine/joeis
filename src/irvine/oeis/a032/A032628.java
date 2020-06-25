package irvine.oeis.a032;

import irvine.oeis.PrimeSubsequence;

/**
 * A032628 Primes that are concatenations of n with <code>n + 5</code>.
 * @author Sean A. Irvine
 */
public class A032628 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A032628() {
    super(new A032610());
  }
}
