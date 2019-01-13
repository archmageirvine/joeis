package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107853.
 * @author Sean A. Irvine
 */
public class A107853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107853() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 2, 1, 2, 3, 2});
  }
}
