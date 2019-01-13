package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272525.
 * @author Sean A. Irvine
 */
public class A272525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272525() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 22, 343, 4664});
  }
}
