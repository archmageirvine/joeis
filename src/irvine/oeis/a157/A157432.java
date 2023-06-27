package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157432 64n + 584.
 * @author Sean A. Irvine
 */
public class A157432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157432() {
    super(1, new long[] {-1, 2}, new long[] {648, 712});
  }
}
