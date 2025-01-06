package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069996 Number of spanning trees on the bipartite graph K_{3,n}.
 * @author Sean A. Irvine
 */
public class A069996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069996() {
    super(0, new long[] {27, -27, 9}, new long[] {0, 1, 12});
  }
}
