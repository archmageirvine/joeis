package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168056.
 * @author Sean A. Irvine
 */
public class A168056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168056() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 3, 5});
  }
}
