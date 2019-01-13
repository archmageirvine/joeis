package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291985.
 * @author Sean A. Irvine
 */
public class A291985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291985() {
    super(new long[] {-1, -1, -1, -2, -2, -3, -3, -3, -3, -3, -3, -2, -2, -1, -1}, new long[] {1, -1, 0, -1, 1, -1, 2, -1, 2, -3, 2, -3, 3, -3, 4});
  }
}
