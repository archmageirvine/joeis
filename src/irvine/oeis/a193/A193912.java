package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193912 Partial sums of A193911.
 * @author Sean A. Irvine
 */
public class A193912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193912() {
    super(1, new long[] {2, -6, 3, 7, -8, 0, 3}, new long[] {1, 4, 11, 25, 50, 93, 162});
  }
}
