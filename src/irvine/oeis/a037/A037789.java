package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037789.
 * @author Sean A. Irvine
 */
public class A037789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037789() {
    super(new long[] {-7, 8, -8, 8}, new long[] {3, 23, 161, 1128});
  }
}
