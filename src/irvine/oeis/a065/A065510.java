package irvine.oeis.a065;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A065510 Primes p such that p^4 - p^3 + p^2 - p + 1 is prime.
 * @author Sean A. Irvine
 */
public class A065510 extends FilterSequence {

  /** Construct the sequence. */
  public A065510() {
    super(new A000040(), p -> p.pow(4).subtract(p.pow(3)).add(p.square()).subtract(p).add(1).isProbablePrime());
  }
}
