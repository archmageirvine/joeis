package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041361.
 * @author Sean A. Irvine
 */
public class A041361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041361() {
    super(new long[] {-1, 0, 0, 0, 390, 0, 0, 0}, new long[] {1, 1, 13, 14, 377, 391, 5069, 5460});
  }
}
