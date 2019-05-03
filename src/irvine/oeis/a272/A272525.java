package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272525 Convolution of nonzero repunits <code>(A002275)</code> with themselves.
 * @author Sean A. Irvine
 */
public class A272525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272525() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 22, 343, 4664});
  }
}
