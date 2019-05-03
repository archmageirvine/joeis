package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082047 Diagonal sums of number array <code>A082046</code>.
 * @author Sean A. Irvine
 */
public class A082047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082047() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 7, 24, 69, 170});
  }
}
