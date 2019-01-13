package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033113.
 * @author Sean A. Irvine
 */
public class A033113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033113() {
    super(new long[] {-3, 1, 3}, new long[] {1, 3, 10});
  }
}
