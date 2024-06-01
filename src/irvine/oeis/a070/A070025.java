package irvine.oeis.a070;

import irvine.oeis.FilterSequence;

/**
 * A070025 At these values of n, the 1st, 2nd, 3rd and 4th cyclotomic polynomials all give prime numbers.
 * @author Sean A. Irvine
 */
public class A070025 extends FilterSequence {

  /** Construct the sequence. */
  public A070025() {
    super(1, new A070020(), k -> k.square().add(1).isProbablePrime());
  }
}
