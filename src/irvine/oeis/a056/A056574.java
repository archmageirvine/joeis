package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056574.
 * @author Sean A. Irvine
 */
public class A056574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056574() {
    super(new long[] {-1, -21, 273, 1092, -1820, -1092, 273, 21}, new long[] {0, 1, 1, 128, 2187, 78125, 2097152, 62748517});
  }
}
