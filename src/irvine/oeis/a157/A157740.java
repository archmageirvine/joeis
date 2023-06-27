package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157740 a(n) = 18522*n + 42.
 * @author Sean A. Irvine
 */
public class A157740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157740() {
    super(1, new long[] {-1, 2}, new long[] {18564, 37086});
  }
}
