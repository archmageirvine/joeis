package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058331.
 * @author Sean A. Irvine
 */
public class A058331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058331() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 9});
  }
}
