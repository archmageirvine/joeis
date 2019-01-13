package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085461.
 * @author Sean A. Irvine
 */
public class A085461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085461() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 13, 70, 246, 671, 1547});
  }
}
