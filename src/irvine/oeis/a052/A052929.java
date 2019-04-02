package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052929 Expansion of (2-3*x-x^2)/((1-x^2)*(1-3*x)).
 * @author Sean A. Irvine
 */
public class A052929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052929() {
    super(new long[] {-3, 1, 3}, new long[] {2, 3, 10});
  }
}
