package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172447.
 * @author Sean A. Irvine
 */
public class A172447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172447() {
    super(new long[] {4, -9, 6}, new long[] {1, 4, 17});
  }
}
