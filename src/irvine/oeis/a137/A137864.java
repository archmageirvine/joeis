package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137864.
 * @author Sean A. Irvine
 */
public class A137864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137864() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 5, 7, 33});
  }
}
