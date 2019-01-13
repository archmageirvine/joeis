package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081068.
 * @author Sean A. Irvine
 */
public class A081068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081068() {
    super(new long[] {1, -8, 8}, new long[] {1, 4, 25});
  }
}
