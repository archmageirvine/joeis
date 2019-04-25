package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059338 <code>a(n) = Sum_{k=1..n} k^5 * binomial(n,k)</code>.
 * @author Sean A. Irvine
 */
public class A059338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059338() {
    super(new long[] {-64, 192, -240, 160, -60, 12}, new long[] {1, 34, 342, 2192, 11000, 47232});
  }
}
