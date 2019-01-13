package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076049.
 * @author Sean A. Irvine
 */
public class A076049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076049() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {0, 3, 8, 25, 54});
  }
}
