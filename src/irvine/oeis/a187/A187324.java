package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187324.
 * @author Sean A. Irvine
 */
public class A187324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187324() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {0, 0, 1, 2, 2, 2, 4});
  }
}
