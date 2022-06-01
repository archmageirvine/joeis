package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092900 A Jacobsthal sequence (A078008) to base 4.
 * @author Sean A. Irvine
 */
public class A092900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092900() {
    super(new long[] {-10, 0, 11, 0}, new long[] {1, 0, 2, 2});
  }
}
