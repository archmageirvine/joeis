package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273982 Number of little cubes visible around an n X n X n cube with a face on a table.
 * @author Sean A. Irvine
 */
public class A273982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273982() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 8, 25});
  }
}
