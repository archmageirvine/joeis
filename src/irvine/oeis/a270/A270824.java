package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270824 Period 16: repeat [0, 1, 1, 0, 2, 3, 3, 2, 3, 2, 2, 3, 1, 0, 0, 1].
 * @author Sean A. Irvine
 */
public class A270824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270824() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 1, 0, 2, 3, 3, 2, 3});
  }
}
