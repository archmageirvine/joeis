package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232602.
 * @author Sean A. Irvine
 */
public class A232602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232602() {
    super(new long[] {16, 16, -8, -16, -7}, new long[] {0, -2, 30, -186, 838});
  }
}
