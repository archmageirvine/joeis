package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175887 Numbers that are congruent to <code>{1, 14} mod 15</code>.
 * @author Sean A. Irvine
 */
public class A175887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175887() {
    super(new long[] {-1, 1, 1}, new long[] {1, 14, 16});
  }
}
