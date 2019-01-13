package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090597.
 * @author Sean A. Irvine
 */
public class A090597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090597() {
    super(new long[] {-4, -2, 0, -1, 3, 1}, new long[] {0, 1, 1, 3, 3, 8});
  }
}
