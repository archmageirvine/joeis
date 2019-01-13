package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022309.
 * @author Sean A. Irvine
 */
public class A022309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022309() {
    super(new long[] {-1, 0, 2}, new long[] {0, 4, 5});
  }
}
