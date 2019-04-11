package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157510 <code>a(n) = 1000*n + 20</code>.
 * @author Sean A. Irvine
 */
public class A157510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157510() {
    super(new long[] {-1, 2}, new long[] {1020, 2020});
  }
}
