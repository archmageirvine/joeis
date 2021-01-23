package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052961 Expansion of (1 - 3*x) / (1 - 5*x + 3*x^2).
 * @author Sean A. Irvine
 */
public class A052961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052961() {
    super(new long[] {-3, 5}, new long[] {1, 2});
  }
}
