package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274545 Values of k such that 5*k-1 and 10*k-1 are both perfect squares.
 * @author Sean A. Irvine
 */
public class A274545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274545() {
    super(new long[] {1, -1, -39202, 39202, 1}, new long[] {1, 29, 33293, 1130977, 1305146305});
  }
}
