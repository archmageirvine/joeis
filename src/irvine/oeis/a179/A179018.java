package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179018.
 * @author Sean A. Irvine
 */
public class A179018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179018() {
    super(new long[] {1, 0, -2, 0, 0, 2}, new long[] {0, 1, 2, 3, 5, 8});
  }
}
