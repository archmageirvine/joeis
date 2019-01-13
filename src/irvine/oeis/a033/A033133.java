package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033133.
 * @author Sean A. Irvine
 */
public class A033133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033133() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 7, 42, 253});
  }
}
