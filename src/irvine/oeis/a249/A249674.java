package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249674.
 * @author Sean A. Irvine
 */
public class A249674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249674() {
    super(new long[] {-1, 2}, new long[] {0, 30});
  }
}
