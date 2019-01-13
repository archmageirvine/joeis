package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287804.
 * @author Sean A. Irvine
 */
public class A287804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287804() {
    super(new long[] {-1, -5, 5}, new long[] {1, 5, 17});
  }
}
