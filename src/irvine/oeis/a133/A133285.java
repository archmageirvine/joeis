package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133285.
 * @author Sean A. Irvine
 */
public class A133285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133285() {
    super(new long[] {1, -23, 23}, new long[] {1, 12, 253});
  }
}
