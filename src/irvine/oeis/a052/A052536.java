package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052536 Number of compositions of n when parts 1 and 2 are of two kinds.
 * @author Sean A. Irvine
 */
public class A052536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052536() {
    super(new long[] {-1, 0, 3}, new long[] {1, 2, 6});
  }
}
