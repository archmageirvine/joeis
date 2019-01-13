package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288516.
 * @author Sean A. Irvine
 */
public class A288516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288516() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 12, 49, 146, 373});
  }
}
