package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070366 a(n) = 5^n mod 9.
 * @author Sean A. Irvine
 */
public class A070366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070366() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 5, 7, 8});
  }
}
