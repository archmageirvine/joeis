package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052957 Expansion of <code>2*(1-x-x^2)/((1-2*x)*(1-2*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A052957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052957() {
    super(new long[] {-4, 2, 2}, new long[] {2, 2, 6});
  }
}
