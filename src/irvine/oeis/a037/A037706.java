package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037706.
 * @author Sean A. Irvine
 */
public class A037706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037706() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 11, 88, 706, 5649});
  }
}
