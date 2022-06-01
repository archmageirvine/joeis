package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101202 Multiples of 142857.
 * @author Sean A. Irvine
 */
public class A101202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101202() {
    super(new long[] {-1, 2}, new long[] {142857, 285714});
  }
}
