package irvine.oeis.a050;

import irvine.oeis.a000.A000149;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A050809 Primes of the form floor( exp(n) ).
 * @author Sean A. Irvine
 */
public class A050809 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A050809() {
    super(new A000149());
  }
}
