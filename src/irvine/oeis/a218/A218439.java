package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218439 <code>a(n) = A001609(n)^2</code>, where g.f. of <code>A001609</code> is <code>x*(1+3*x^2)/(1-x-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A218439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218439() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 16, 25, 36, 100});
  }
}
