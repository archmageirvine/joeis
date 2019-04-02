package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157842 3600n^2 - 5599n + 2177.
 * @author Sean A. Irvine
 */
public class A157842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157842() {
    super(new long[] {1, -3, 3}, new long[] {178, 5379, 17780});
  }
}
