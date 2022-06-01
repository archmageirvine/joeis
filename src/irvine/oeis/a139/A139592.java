package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139592 A033585(n) followed by A139271(n+1).
 * @author Sean A. Irvine
 */
public class A139592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139592() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 10, 20});
  }
}
