package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082045 Diagonal sums of number array <code>A082043</code>.
 * @author Sean A. Irvine
 */
public class A082045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082045() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 6, 20, 59, 150});
  }
}
