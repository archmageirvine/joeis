package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052899 Expansion of g.f.: (1-2*x) / ((x-1)*(4*x^2+2*x-1)).
 * @author Sean A. Irvine
 */
public class A052899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052899() {
    super(new long[] {-4, 2, 3}, new long[] {1, 1, 5});
  }
}
