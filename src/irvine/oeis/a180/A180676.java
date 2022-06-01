package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180676 The Gi3 sums of the Pell-Jacobsthal triangle A013609.
 * @author Sean A. Irvine
 */
public class A180676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180676() {
    super(new long[] {-1, 4, -6, 20}, new long[] {1, 1, 1, 1});
  }
}
