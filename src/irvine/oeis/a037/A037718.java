package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037718.
 * @author Sean A. Irvine
 */
public class A037718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037718() {
    super(new long[] {-6, 7, -7, 7}, new long[] {2, 12, 73, 441});
  }
}
