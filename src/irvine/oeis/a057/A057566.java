package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057566.
 * @author Sean A. Irvine
 */
public class A057566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057566() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 2, 8, 20});
  }
}
