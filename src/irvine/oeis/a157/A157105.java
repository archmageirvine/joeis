package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157105 a(n) = 137842*n - 30996.
 * @author Sean A. Irvine
 */
public class A157105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157105() {
    super(new long[] {-1, 2}, new long[] {106846, 244688});
  }
}
