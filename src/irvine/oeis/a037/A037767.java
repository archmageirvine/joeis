package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037767.
 * @author Sean A. Irvine
 */
public class A037767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037767() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {3, 18, 110, 661, 3969});
  }
}
