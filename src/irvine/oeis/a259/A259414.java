package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259414 Triangular numbers (A000217) that are the sum of thirteen consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A259414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259414() {
    super(new long[] {1, -1, 0, 0, -1684802, 1684802, 0, 0, 1}, new long[] {2080, 414505, 28815436, 49317346, 3428789455L, 698283666730L, 48548229019381L, 83089887991201L, 5776831256176630L});
  }
}
