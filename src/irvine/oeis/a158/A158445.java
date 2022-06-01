package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158445 25n^2 + 5.
 * @author Sean A. Irvine
 */
public class A158445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158445() {
    super(new long[] {1, -3, 3}, new long[] {30, 105, 230});
  }
}
