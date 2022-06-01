package irvine.oeis.a298;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A298015 Coordination sequence of snub-632 tiling with respect to a trivalent node of type short-short-short.
 * @author Sean A. Irvine
 */
public class A298015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A298015() {
    super(new long[] {-1, 0, 0, 2, 0, 0},
      new long[] {18, 33, 48, 30, 51, 72},
      1, 3, 6, 15, 21);
  }
}
