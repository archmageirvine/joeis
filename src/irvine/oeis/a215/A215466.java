package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215466 Expansion of <code>x*(1-4*x+x^2) / ( (x^2-7*x+1)*(x^2-3*x+1) )</code>.
 * @author Sean A. Irvine
 */
public class A215466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215466() {
    super(new long[] {-1, 10, -23, 10}, new long[] {0, 1, 6, 38});
  }
}
