package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122679 Invariant number of internal vertices of n-circum-C_5 H_5 systems.
 * @author Sean A. Irvine
 */
public class A122679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122679() {
    super(1, new long[] {1, -4, 4}, new long[] {0, 5, 25});
  }
}
