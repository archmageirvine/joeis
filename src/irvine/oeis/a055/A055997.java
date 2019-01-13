package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055997.
 * @author Sean A. Irvine
 */
public class A055997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055997() {
    super(new long[] {1, -7, 7}, new long[] {1, 2, 9});
  }
}
