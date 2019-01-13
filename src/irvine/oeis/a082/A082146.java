package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082146.
 * @author Sean A. Irvine
 */
public class A082146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082146() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 1, -2, 1, -1, 0, 1, 0, 1}, new long[] {1, 0, 1, 1, 2, 2, 4, 3, 6, 6, 8, 9, 13, 12});
  }
}
