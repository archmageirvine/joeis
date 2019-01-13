package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033145.
 * @author Sean A. Irvine
 */
public class A033145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033145() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 81, 730});
  }
}
