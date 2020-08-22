package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131974 Period 8: repeat [1, 2, 3, 4, -5, -4, -3, -2].
 * @author Sean A. Irvine
 */
public class A131974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131974() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, -5, -4, -3, -2});
  }
}
