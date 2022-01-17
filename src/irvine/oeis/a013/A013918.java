package irvine.oeis.a013;

import irvine.oeis.a007.A007504;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A013918 Primes equal to the sum of the first k primes for some k.
 * @author Sean A. Irvine
 */
public class A013918 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A013918() {
    super(new A007504());
  }
}
