package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157435 64n + 632.
 * @author Sean A. Irvine
 */
public class A157435 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157435() {
    super(1, new long[] {-1, 2}, new long[] {696, 760});
  }
}
