package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082150 A transform of C(n,2).
 * @author Sean A. Irvine
 */
public class A082150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082150() {
    super(new long[] {-512, 1152, -1056, 504, -132, 18}, new long[] {0, 0, 1, 9, 60, 360});
  }
}
