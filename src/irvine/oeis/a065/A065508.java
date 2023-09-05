package irvine.oeis.a065;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A065508 Primes p such that p^2 - p + 1 is prime.
 * @author Sean A. Irvine
 */
public class A065508 extends FilterSequence {

  /** Construct the sequence. */
  public A065508() {
    super(new A000040(), p -> p.square().subtract(p).add(1).isProbablePrime());
  }
}
