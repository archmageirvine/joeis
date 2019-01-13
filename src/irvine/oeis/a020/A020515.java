package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020515.
 * @author Sean A. Irvine
 */
public class A020515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020515() {
    super(new long[] {8, -14, 7}, new long[] {1, 3, 13});
  }
}
