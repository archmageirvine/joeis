package irvine.oeis.a050;

import irvine.oeis.prime.PrimeSubsequence;
import irvine.oeis.a008.A008509;

/**
 * A050721 Primes arising in A083571.
 * @author Sean A. Irvine
 */
public class A050721 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050721() {
    super(new A008509(), 1);
  }
}
