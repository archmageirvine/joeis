package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111283.
 * @author Sean A. Irvine
 */
public class A111283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111283() {
    super(new long[] {-1, 0, -3, 5}, new long[] {1, 2, 6, 23});
  }
}
