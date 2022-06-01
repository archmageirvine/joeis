package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047707 Number of monotone Boolean functions of n variables with 3 mincuts. Also Sperner systems with 3 blocks.
 * @author Sean A. Irvine
 */
public class A047707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047707() {
    super(new long[] {-5760, 9072, -5684, 1820, -315, 28}, new long[] {0, 0, 0, 2, 64, 1090});
  }
}
