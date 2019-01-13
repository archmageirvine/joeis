package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090279.
 * @author Sean A. Irvine
 */
public class A090279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090279() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {3, 4, 1, 3, 2, 1, 4, 2, 4, 2, 1, 4, 3, 1, 2, 3, 2, 3, 1, 2, 4, 1, 3});
  }
}
