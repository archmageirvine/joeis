package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209265.
 * @author Sean A. Irvine
 */
public class A209265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209265() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 28, 1537, 21322, 145633, 659176, 2284273, 6565462});
  }
}
