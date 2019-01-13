package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082107.
 * @author Sean A. Irvine
 */
public class A082107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082107() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 8, 28, 79, 190});
  }
}
