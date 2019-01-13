package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133310.
 * @author Sean A. Irvine
 */
public class A133310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133310() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 1, 3});
  }
}
