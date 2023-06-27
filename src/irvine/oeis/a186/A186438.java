package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186438 Positive numbers whose squares end in two identical digits.
 * @author Sean A. Irvine
 */
public class A186438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186438() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {10, 12, 20, 30, 38, 40, 50, 60});
  }
}
