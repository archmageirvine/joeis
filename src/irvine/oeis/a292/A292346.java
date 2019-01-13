package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292346.
 * @author Sean A. Irvine
 */
public class A292346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292346() {
    super(new long[] {1, -3, 3}, new long[] {204, 748, 1548});
  }
}
