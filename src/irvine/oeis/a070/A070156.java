package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070156 n-1,n+1,1+n^2 and 1+n^4 are all prime numbers.
 * @author Sean A. Irvine
 */
public class A070156 extends FilterSequence {

  /** Construct the sequence. */
  public A070156() {
    super(new A070155(), k -> k.pow(4).add(1).isProbablePrime());
  }
}
