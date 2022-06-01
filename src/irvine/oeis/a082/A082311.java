package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082311 A Jacobsthal sequence trisection.
 * @author Sean A. Irvine
 */
public class A082311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082311() {
    super(new long[] {8, 7}, new long[] {1, 5});
  }
}
