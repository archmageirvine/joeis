package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185453 Trajectory of 1 under repeated application of the map in A185452.
 * @author Sean A. Irvine
 */
public class A185453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185453() {
    super(1, new long[] {1, 0, 0, 0, 0}, new long[] {1, 3, 8, 4, 2});
  }
}
