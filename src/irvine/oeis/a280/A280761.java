package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280761 Solutions <code>y_n</code> to the negative Pell equation <code>y^2 = 72*x^2 - 8</code>.
 * @author Sean A. Irvine
 */
public class A280761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280761() {
    super(new long[] {-1, 34}, new long[] {8, 280});
  }
}
