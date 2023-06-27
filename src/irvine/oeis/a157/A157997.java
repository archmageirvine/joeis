package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157997 288n - 1.
 * @author Sean A. Irvine
 */
public class A157997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157997() {
    super(1, new long[] {-1, 2}, new long[] {287, 575});
  }
}
