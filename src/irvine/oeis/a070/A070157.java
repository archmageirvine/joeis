package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070157 n-1, n+1, 1+n^2, 1+n^4 and 1+n^8 are all prime numbers.
 * @author Sean A. Irvine
 */
public class A070157 extends FilterSequence {

  /** Construct the sequence. */
  public A070157() {
    super(new A070156(), k -> k.pow(8).add(1).isProbablePrime());
  }
}
