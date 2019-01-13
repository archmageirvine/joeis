package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125950.
 * @author Sean A. Irvine
 */
public class A125950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125950() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
