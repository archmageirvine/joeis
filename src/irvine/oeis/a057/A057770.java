package irvine.oeis.a057;

import irvine.oeis.a045.A045574;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A057770 The primes in A045574.
 * @author Sean A. Irvine
 */
public class A057770 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A057770() {
    super(new A045574());
  }
}

