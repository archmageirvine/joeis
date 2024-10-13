package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.oeis.FilterSequence;

/**
 * A072571 Even interprimes i = (p+q)/2 (where p, q are consecutive primes) such that (q-p)/2 is divisible by 3.
 * @author Sean A. Irvine
 */
public class A072571 extends FilterSequence {

  private static final Fast FAST = new Fast();

  /** Construct the sequence. */
  public A072571() {
    super(1, new A072568(), k -> FAST.nextPrime(k).subtract(FAST.prevPrime(k)).divide2().mod(3) == 0);
  }
}
