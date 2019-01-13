package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028051.
 * @author Sean A. Irvine
 */
public class A028051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028051() {
    super(new long[] {-1440, 1104, -286, 29}, new long[] {1, 29, 555, 8905});
  }
}
