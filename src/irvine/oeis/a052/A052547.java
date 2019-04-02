package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052547 Expansion of (1-x)/(x^3-2*x^2-x+1).
 * @author Sean A. Irvine
 */
public class A052547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052547() {
    super(new long[] {-1, 2, 1}, new long[] {1, 0, 2});
  }
}
