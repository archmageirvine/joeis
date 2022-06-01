package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178141 Period 6: repeat [4, -1, 2, -4, 1, 2].
 * @author Sean A. Irvine
 */
public class A178141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178141() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {4, -1, 2, -4, 1, 2});
  }
}
