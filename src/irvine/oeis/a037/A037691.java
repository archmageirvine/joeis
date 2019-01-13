package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037691.
 * @author Sean A. Irvine
 */
public class A037691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037691() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {1, 9, 63, 444, 3109});
  }
}
