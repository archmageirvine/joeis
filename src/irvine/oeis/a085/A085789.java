package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085789.
 * @author Sean A. Irvine
 */
public class A085789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085789() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 18, 54, 120});
  }
}
