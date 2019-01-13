package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228583.
 * @author Sean A. Irvine
 */
public class A228583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228583() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 0, 0, 0, 1, 15, 135, 777, 3270});
  }
}
