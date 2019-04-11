package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122014 Expansion of <code>-x*(8*x^7-33*x^6-30*x^5+88*x^4+35*x^3-33*x^2-11*x-1)/((x^4-x^3-3*x^2+x+1)*(x^4+x^3-3*x^2-x+1))</code>.
 * @author Sean A. Irvine
 */
public class A122014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122014() {
    super(new long[] {-1, 0, 7, 0, -13, 0, 7, 0}, new long[] {1, 11, 40, 42, 179, 181, 773, 790});
  }
}
