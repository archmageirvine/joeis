package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029365.
 * @author Sean A. Irvine
 */
public class A029365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029365() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, -1, 1, -1, 0, 0, -2, 0, 0, -1, 1, -1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 2, 1, 1, 1, 3, 1, 2, 2, 3, 3, 2, 3, 4, 4, 3, 4, 6, 4, 5, 5});
  }
}
