package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101202.
 * @author Sean A. Irvine
 */
public class A101202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101202() {
    super(new long[] {-1, 2}, new long[] {142857, 285714});
  }
}
