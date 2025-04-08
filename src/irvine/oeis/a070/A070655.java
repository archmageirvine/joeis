package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070655 Numbers k such that k+1, k^2+1, k^4+1 and k^8+1 are primes.
 * @author Sean A. Irvine
 */
public class A070655 extends FilterSequence {

  /** Construct the sequence. */
  public A070655() {
    super(1, new A070325(), k -> k.pow(8).add(1).isProbablePrime());
  }
}
