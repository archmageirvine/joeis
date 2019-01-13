package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069403.
 * @author Sean A. Irvine
 */
public class A069403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069403() {
    super(new long[] {1, -4, 4}, new long[] {1, 3, 9});
  }
}
