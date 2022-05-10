package irvine.oeis.a056;

import irvine.oeis.a000.A000213;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A056816 Primes in the tribonacci sequence A000213.
 * @author Sean A. Irvine
 */
public class A056816 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A056816() {
    super(new A000213());
  }
}

