package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037670.
 * @author Sean A. Irvine
 */
public class A037670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037670() {
    super(new long[] {-7, 1, 0, 7}, new long[] {3, 23, 161, 1130});
  }
}
