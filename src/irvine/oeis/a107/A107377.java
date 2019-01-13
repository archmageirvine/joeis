package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107377.
 * @author Sean A. Irvine
 */
public class A107377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107377() {
    super(new long[] {-1, -5, 0, 5}, new long[] {0, 1, 1, 2});
  }
}
