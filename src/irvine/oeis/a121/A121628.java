package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121628 Nonnegative k such that 3*k + 1 is a perfect cube.
 * @author Sean A. Irvine
 */
public class A121628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121628() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 21, 114, 333});
  }
}
