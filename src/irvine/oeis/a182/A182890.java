package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182890.
 * @author Sean A. Irvine
 */
public class A182890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182890() {
    super(new long[] {-1, 2, 1, 2}, new long[] {0, 1, 2, 5});
  }
}
