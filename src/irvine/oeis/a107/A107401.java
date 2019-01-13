package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107401.
 * @author Sean A. Irvine
 */
public class A107401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107401() {
    super(new long[] {-1, -1, 4, 4, -1}, new long[] {0, 1, 1, 2, 3});
  }
}
