package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186439 Numbers whose squares end in three identical digits.
 * @author Sean A. Irvine
 */
public class A186439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186439() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {38, 100, 200, 300, 400, 462, 500, 538});
  }
}
