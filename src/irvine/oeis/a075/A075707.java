package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005385;

/**
 * A075707 Safe primes (A005385) (p and (p-1)/2 are primes) such that 12*p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A075707 extends FilterSequence {

  /** Construct the sequence. */
  public A075707() {
    super(1, new A005385(), p -> p.multiply(12).add(1).isProbablePrime());
  }
}
