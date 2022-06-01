package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007981 Number of nonsplit type 2 metacyclic 2-groups of order 2^n.
 * @author Sean A. Irvine
 */
public class A007981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007981() {
    super(new long[] {0, 0, 0, -1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 2, 4, 6});
  }
}
