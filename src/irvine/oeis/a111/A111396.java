package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111396.
 * @author Sean A. Irvine
 */
public class A111396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111396() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 12, 30, 55});
  }
}
