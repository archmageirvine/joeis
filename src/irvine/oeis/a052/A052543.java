package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052543 Expansion of (1-x)/(1-3x-2x^2+2x^3).
 * @author Sean A. Irvine
 */
public class A052543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052543() {
    super(new long[] {-2, 2, 3}, new long[] {1, 2, 8});
  }
}
