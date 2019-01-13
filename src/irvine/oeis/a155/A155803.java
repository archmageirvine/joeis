package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155803.
 * @author Sean A. Irvine
 */
public class A155803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155803() {
    super(new long[] {-2, 1, 0, 2}, new long[] {0, 0, 0, 1});
  }
}
