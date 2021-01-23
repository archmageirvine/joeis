package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241979 (0,1) sequence such that lengths of three consecutive runs are always distinct.
 * @author Sean A. Irvine
 */
public class A241979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241979() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {0, 1, 1, 0, 0, 0, 1});
  }
}
