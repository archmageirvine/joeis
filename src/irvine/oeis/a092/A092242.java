package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092242 Numbers that are congruent to <code>{5, 7} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A092242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092242() {
    super(new long[] {-1, 1, 1}, new long[] {5, 7, 17});
  }
}
