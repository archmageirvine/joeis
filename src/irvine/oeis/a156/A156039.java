package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156039 Number of compositions (ordered partitions) of n into 4 parts, where the first is at least as great as each of the others.
 * @author Sean A. Irvine
 */
public class A156039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156039() {
    super(new long[] {-1, 2, -1, 1, -1, -1, 1, -1, 2}, new long[] {1, 1, 4, 7, 11, 17, 26, 35, 48});
  }
}
