package irvine.oeis.a086;

import irvine.oeis.FilterSequence;

/**
 * A086220 Numbers n such that p=n^2+2, p+2, p+6 and p+8 are four consecutive primes.
 * @author Sean A. Irvine
 */
public class A086220 extends FilterSequence {

  /** Construct the sequence. */
  public A086220() {
    super(1, new A086380(), k -> k.square().add(10).isProbablePrime());
  }
}
