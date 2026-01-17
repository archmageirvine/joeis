package irvine.oeis.a392;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A392348 Primes p such that the Chebyshev distance from 1 to p in the Ulam spiral is not a prime number.
 * @author Sean A. Irvine
 */
public class A392348 extends FilterSequence {

  /** Construct the sequence. */
  public A392348() {
    super(1, new A000040(), p -> !p.subtract(1).sqrt().add(1).divide2().isProbablePrime());
  }
}

