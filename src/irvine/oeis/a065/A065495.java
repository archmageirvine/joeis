package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065495.
 * @author Sean A. Irvine
 */
public class A065495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065495() {
    super(new long[] {-4, -2, 2, 2}, new long[] {1, 2, 6, 14});
  }
}
