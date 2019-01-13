package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226310.
 * @author Sean A. Irvine
 */
public class A226310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226310() {
    super(new long[] {2, 1, 1, 1, 1}, new long[] {0, 1, 1, 1, 1});
  }
}
