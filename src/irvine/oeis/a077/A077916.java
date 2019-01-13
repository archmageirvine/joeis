package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077916.
 * @author Sean A. Irvine
 */
public class A077916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077916() {
    super(new long[] {-1, -1, 4, -1}, new long[] {1, -1, 5, -10});
  }
}
