package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089660.
 * @author Sean A. Irvine
 */
public class A089660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089660() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 2, 35, 276, 1522});
  }
}
