package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107384.
 * @author Sean A. Irvine
 */
public class A107384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107384() {
    super(new long[] {-3, 0, 3, 1}, new long[] {0, 1, 1, 2});
  }
}
