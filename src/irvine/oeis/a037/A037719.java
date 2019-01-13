package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037719.
 * @author Sean A. Irvine
 */
public class A037719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037719() {
    super(new long[] {-7, 8, -8, 8}, new long[] {2, 14, 99, 696});
  }
}
