package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157803 a(n) = 8984250*n - 8464830.
 * @author Sean A. Irvine
 */
public class A157803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157803() {
    super(new long[] {-1, 2}, new long[] {519420, 9503670});
  }
}
