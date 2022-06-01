package irvine.oeis.a346;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A346054 Number of ways to tile a 3 X n strip with dominos, and L-shaped 5-minos.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A346054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A346054() {
    super(new long[] {-4, 5, 3, 1}, new long[] {1, 0, 3, 8});
  }
}
