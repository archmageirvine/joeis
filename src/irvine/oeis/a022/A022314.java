package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022314.
 * @author Sean A. Irvine
 */
public class A022314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022314() {
    super(new long[] {-1, 0, 2}, new long[] {0, 9, 10});
  }
}
