package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037669.
 * @author Sean A. Irvine
 */
public class A037669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037669() {
    super(new long[] {-6, 1, 0, 6}, new long[] {3, 20, 120, 723});
  }
}
