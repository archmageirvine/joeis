package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103433.
 * @author Sean A. Irvine
 */
public class A103433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103433() {
    super(new long[] {-1, 9, -16, 9}, new long[] {0, 1, 5, 30});
  }
}
