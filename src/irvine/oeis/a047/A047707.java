package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047707.
 * @author Sean A. Irvine
 */
public class A047707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047707() {
    super(new long[] {-5760, 9072, -5684, 1820, -315, 28}, new long[] {0, 0, 0, 2, 64, 1090});
  }
}
