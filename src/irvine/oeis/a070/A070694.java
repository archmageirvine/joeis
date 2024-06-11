package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070655 Numbers n such that n+1, n^2+1, n^4+1 and n^8+1 are primes.
 * @author Sean A. Irvine
 */
public class A070694 extends FilterSequence {

  /** Construct the sequence. */
  public A070694() {
    super(1, new A070655(), k -> k.pow(16).add(1).isProbablePrime());
  }
}
