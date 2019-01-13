package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085462.
 * @author Sean A. Irvine
 */
public class A085462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085462() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 77, 273, 748, 1729});
  }
}
