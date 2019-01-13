package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168461.
 * @author Sean A. Irvine
 */
public class A168461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168461() {
    super(new long[] {-1, 1, 1}, new long[] {0, 10, 10});
  }
}
