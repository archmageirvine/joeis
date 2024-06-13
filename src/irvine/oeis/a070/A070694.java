package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070694 Numbers b such that b+1, b^2+1, b^4+1, b^8+1 and b^16+1 are primes.
 * @author Sean A. Irvine
 */
public class A070694 extends FilterSequence {

  /** Construct the sequence. */
  public A070694() {
    super(1, new A070655(), k -> k.pow(16).add(1).isProbablePrime());
  }
}
