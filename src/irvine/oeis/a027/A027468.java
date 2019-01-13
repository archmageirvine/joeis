package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027468.
 * @author Sean A. Irvine
 */
public class A027468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027468() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 27});
  }
}
