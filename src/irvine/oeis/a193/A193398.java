package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193398.
 * @author Sean A. Irvine
 */
public class A193398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193398() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {215, 636, 1557, 3018, 5555, 8968, 14225, 20790});
  }
}
