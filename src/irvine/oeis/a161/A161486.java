package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161486.
 * @author Sean A. Irvine
 */
public class A161486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161486() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 69, 336, 573, 936, 2449, 3820});
  }
}
