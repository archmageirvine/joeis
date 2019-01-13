package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168237.
 * @author Sean A. Irvine
 */
public class A168237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168237() {
    super(new long[] {-1, 1, 1}, new long[] {0, 3, 3});
  }
}
