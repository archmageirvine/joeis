package irvine.oeis.a049;

import irvine.oeis.PrimeSubsequence;
import irvine.oeis.a001.A001045;

/**
 * A049883 Primes in the Jacobsthal sequence (A001045).
 * @author Sean A. Irvine
 */
public class A049883 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A049883() {
    super(new A001045());
  }
}
