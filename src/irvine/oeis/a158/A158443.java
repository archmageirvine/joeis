package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158443 16n^2 - 4.
 * @author Sean A. Irvine
 */
public class A158443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158443() {
    super(new long[] {1, -3, 3}, new long[] {12, 60, 140});
  }
}
