package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153127.
 * @author Sean A. Irvine
 */
public class A153127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153127() {
    super(new long[] {1, -3, 3}, new long[] {6, 33, 80});
  }
}
