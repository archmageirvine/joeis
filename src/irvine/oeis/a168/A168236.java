package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168236.
 * @author Sean A. Irvine
 */
public class A168236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168236() {
    super(new long[] {-1, 1, 1}, new long[] {2, 2, 5});
  }
}
