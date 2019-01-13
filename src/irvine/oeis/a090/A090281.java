package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090281.
 * @author Sean A. Irvine
 */
public class A090281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090281() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 2, 3, 4, 4});
  }
}
