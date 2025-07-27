package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078997 Nonzero coefficients of the polynomials in the denominator of the generating function x/(1-x-x^2) for the Fibonacci sequence and its successive derivatives starting with the highest power of x.
 * @author Sean A. Irvine
 */
public class A078997 extends FilterSequence {

  /** Construct the sequence. */
  public A078997() {
    super(0, new A078996(), NONZERO);
  }
}
