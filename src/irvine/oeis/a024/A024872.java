package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024872.
 * @author Sean A. Irvine
 */
public class A024872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024872() {
    super(new long[] {1, 1, 1, 2, -3, -1, -1, -2, 3, 1}, new long[] {2, 4, 12, 19, 43, 70, 138, 223, 409, 662});
  }
}
