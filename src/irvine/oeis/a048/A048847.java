package irvine.oeis.a048;

import irvine.oeis.PrimeSubsequence;
import irvine.oeis.a019.A019519;

/**
 * A048847 Primes formed by concatenation of first k odd numbers.
 * @author Sean A. Irvine
 */
public class A048847 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A048847() {
    super(new A019519());
  }
}
