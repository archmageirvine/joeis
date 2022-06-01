package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158130 121n - 1.
 * @author Sean A. Irvine
 */
public class A158130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158130() {
    super(new long[] {-1, 2}, new long[] {120, 241});
  }
}
