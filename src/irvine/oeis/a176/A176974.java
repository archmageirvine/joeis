package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176974.
 * @author Sean A. Irvine
 */
public class A176974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176974() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 7, 5, 3, 3, 13, 9});
  }
}
