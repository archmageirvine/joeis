package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172193.
 * @author Sean A. Irvine
 */
public class A172193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172193() {
    super(new long[] {1, -3, 3}, new long[] {1, 37, 83});
  }
}
