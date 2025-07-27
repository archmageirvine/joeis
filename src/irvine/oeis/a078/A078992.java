package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078992 Nonzero coefficients of the polynomials in the numerator of the generating function x/(1-x-x^2) for the Fibonacci sequence and its successive derivatives starting with the highest power of x.
 * @author Sean A. Irvine
 */
public class A078992 extends FilterSequence {

  /** Construct the sequence. */
  public A078992() {
    super(0, new A078991(), NONZERO);
  }
}
