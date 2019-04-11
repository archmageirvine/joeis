package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052972 Expansion of <code>(1-x^3)/(1-x-x^2-x^3+x^5)</code>.
 * @author Sean A. Irvine
 */
public class A052972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052972() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 1, 2, 3, 6});
  }
}
