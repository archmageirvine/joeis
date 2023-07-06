package irvine.oeis.a053;

import irvine.oeis.prime.PrimeSubsequence;

/**
 * A053032 Odd primes p with one zero in Fibonacci numbers mod p.
 * @author Sean A. Irvine
 */
public class A053032 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A053032() {
    super(new A053031().skip(2));
  }
}
