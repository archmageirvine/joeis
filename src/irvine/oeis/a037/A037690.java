package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037690.
 * @author Sean A. Irvine
 */
public class A037690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037690() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {1, 8, 48, 291, 1747});
  }
}
