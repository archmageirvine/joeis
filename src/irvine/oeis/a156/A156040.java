package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156040 Number of compositions (ordered partitions) of n into 3 parts (some of which may be zero), where the first is at least as great as each of the others.
 * @author Sean A. Irvine
 */
public class A156040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156040() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 1, 3, 4, 6, 8});
  }
}
