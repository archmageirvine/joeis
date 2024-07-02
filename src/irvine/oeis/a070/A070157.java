package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070157 Numbers k such that k-1, k+1, k^2+1, k^4+1 and k^8+1 are all prime numbers.
 * @author Sean A. Irvine
 */
public class A070157 extends FilterSequence {

  /** Construct the sequence. */
  public A070157() {
    super(new A070156(), k -> k.pow(8).add(1).isProbablePrime());
  }
}
