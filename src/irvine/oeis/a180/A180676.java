package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180676 The <code>Gi3</code> sums of the Pell-Jacobsthal triangle <code>A013609</code>.
 * @author Sean A. Irvine
 */
public class A180676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180676() {
    super(new long[] {-1, 4, -6, 20}, new long[] {1, 1, 1, 1});
  }
}
