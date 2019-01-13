package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069074.
 * @author Sean A. Irvine
 */
public class A069074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069074() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 120, 336, 720});
  }
}
