package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107600.
 * @author Sean A. Irvine
 */
public class A107600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107600() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 18, 101, 357, 978, 2274, 4711});
  }
}
