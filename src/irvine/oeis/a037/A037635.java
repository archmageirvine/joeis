package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037635.
 * @author Sean A. Irvine
 */
public class A037635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037635() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 15, 108, 758});
  }
}
