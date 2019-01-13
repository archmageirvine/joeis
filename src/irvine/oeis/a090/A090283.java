package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090283.
 * @author Sean A. Irvine
 */
public class A090283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090283() {
    super(new long[] {1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, 1}, new long[] {3, 4, 4, 3, 2, 1, 1, 2, 2, 1, 1, 2, 3, 4, 4, 3, 4, 3, 2, 1, 1});
  }
}
