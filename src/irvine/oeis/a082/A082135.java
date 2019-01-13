package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082135.
 * @author Sean A. Irvine
 */
public class A082135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082135() {
    super(new long[] {-225, 240, -94, 16}, new long[] {0, 1, 8, 51});
  }
}
