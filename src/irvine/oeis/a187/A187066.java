package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187066.
 * @author Sean A. Irvine
 */
public class A187066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187066() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {1, 0, 0, 1, 2, 1});
  }
}
