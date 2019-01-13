package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022315.
 * @author Sean A. Irvine
 */
public class A022315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022315() {
    super(new long[] {-1, 0, 2}, new long[] {0, 10, 11});
  }
}
