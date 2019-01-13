package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123650.
 * @author Sean A. Irvine
 */
public class A123650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123650() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {4, 45, 280, 1105, 3276, 8029});
  }
}
