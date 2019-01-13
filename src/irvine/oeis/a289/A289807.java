package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289807.
 * @author Sean A. Irvine
 */
public class A289807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289807() {
    super(new long[] {-1, 2, 1, -5, 2, 3}, new long[] {1, 4, 13, 42, 133, 424});
  }
}
