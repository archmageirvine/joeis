package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169599 Numbers that are congruent to <code>{4, 23} mod 29</code>.
 * @author Sean A. Irvine
 */
public class A169599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169599() {
    super(new long[] {-1, 1, 1}, new long[] {4, 23, 33});
  }
}
