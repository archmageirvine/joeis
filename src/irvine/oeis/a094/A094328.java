package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094328 Iterate the map in A006369 starting at 4.
 * @author Sean A. Irvine
 */
public class A094328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094328() {
    super(1, new long[] {1, 0, 0, 0, 0}, new long[] {4, 5, 7, 9, 6});
  }
}
