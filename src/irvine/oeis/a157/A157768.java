package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157768 27225n^2 - 39202n + 14112.
 * @author Sean A. Irvine
 */
public class A157768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157768() {
    super(new long[] {1, -3, 3}, new long[] {2135, 44608, 141531});
  }
}
