package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157738 18522n - 42.
 * @author Sean A. Irvine
 */
public class A157738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157738() {
    super(new long[] {-1, 2}, new long[] {18480, 37002});
  }
}
