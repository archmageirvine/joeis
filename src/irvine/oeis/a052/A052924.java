package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052924 G.f.: (1-x)/(1-3*x-x^2).
 * @author Sean A. Irvine
 */
public class A052924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052924() {
    super(new long[] {1, 3}, new long[] {1, 2});
  }
}
