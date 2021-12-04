package irvine.oeis.a053;

import irvine.oeis.PrimeSubsequence;
import irvine.oeis.SkipSequence;

/**
 * A053032 Odd primes p with one zero in Fibonacci numbers mod p.
 * @author Sean A. Irvine
 */
public class A053032 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A053032() {
    super(new SkipSequence(new A053031(), 2));
  }
}
