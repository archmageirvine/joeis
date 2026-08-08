package irvine.oeis.a086;

import irvine.oeis.FilterSequence;

/**
 * A086380 Numbers n such that p = n^2 + 2, p+2 and p+6 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A086380 extends FilterSequence {

  /** Construct the sequence. */
  public A086380() {
    super(1, new A086381(), k -> k.square().add(8).isProbablePrime());
  }
}
