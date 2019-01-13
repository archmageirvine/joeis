package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187067.
 * @author Sean A. Irvine
 */
public class A187067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187067() {
    super(new long[] {-1, 0, 2, 0, 1, 0}, new long[] {0, 1, 1, 1, 1, 2});
  }
}
