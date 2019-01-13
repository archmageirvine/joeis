package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266842.
 * @author Sean A. Irvine
 */
public class A266842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266842() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 2, 20, 43, 336, 687});
  }
}
