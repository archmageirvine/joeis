package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187891.
 * @author Sean A. Irvine
 */
public class A187891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187891() {
    super(new long[] {-1, 0, 2}, new long[] {0, 5, 4});
  }
}
