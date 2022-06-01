package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101622 A Horadam-Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A101622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101622() {
    super(new long[] {-2, 1, 2}, new long[] {0, 1, 6});
  }
}
