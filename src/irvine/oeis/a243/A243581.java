package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243581.
 * @author Sean A. Irvine
 */
public class A243581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243581() {
    super(new long[] {1, -3, 3}, new long[] {119, 351, 711});
  }
}
