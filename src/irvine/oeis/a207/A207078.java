package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207078 Nonnegative values x of solutions <code>(x,</code> y) to the Diophantine equation <code>x^2 + (x+511)^2 =</code> y^2.
 * @author Sean A. Irvine
 */
public class A207078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207078() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -6, 6, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 33, 156, 308, 365, 584, 665, 969, 1380, 1533, 1700, 2349, 3185, 3504, 4745, 5208, 6956, 9333, 10220});
  }
}
