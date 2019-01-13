package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082384.
 * @author Sean A. Irvine
 */
public class A082384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082384() {
    super(new long[] {-4, 12, -11, 1, 3}, new long[] {1, 6, 5, 22, 13});
  }
}
