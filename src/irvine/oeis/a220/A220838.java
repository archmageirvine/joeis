package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220838 Tropical version of Somos-4 sequence A006720.
 * @author Sean A. Irvine
 */
public class A220838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220838() {
    super(1, new long[] {1, -2, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {-1, 0, 0, 0, 1, 1, 2, 3, 3, 5});
  }
}
