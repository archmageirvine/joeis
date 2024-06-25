package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070156 Numbers k such that k-1, k+1, k^2+1 and k^4+1 are all prime numbers.
 * @author Sean A. Irvine
 */
public class A070156 extends FilterSequence {

  /** Construct the sequence. */
  public A070156() {
    super(new A070155(), k -> k.pow(4).add(1).isProbablePrime());
  }
}
