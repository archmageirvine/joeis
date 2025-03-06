package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005385;

/**
 * A075706 Safe primes (A005385) (p and (p-1)/2 are primes) such that 8*p+1 (A023228) is also prime.
 * @author Sean A. Irvine
 */
public class A075706 extends FilterSequence {

  /** Construct the sequence. */
  public A075706() {
    super(1, new A005385(), p -> p.multiply(8).add(1).isProbablePrime());
  }
}
