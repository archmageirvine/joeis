package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243580.
 * @author Sean A. Irvine
 */
public class A243580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243580() {
    super(new long[] {1, -3, 3}, new long[] {87, 287, 615});
  }
}
