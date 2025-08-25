package irvine.oeis.a252;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A252770 Numbers k such that the heptagonal number H(k) is equal to the sum of the pentagonal numbers P(m), P(m+1), P(m+2) and P(m+3) for some m.
 * @author Sean A. Irvine
 */
public class A252770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252770() {
    super(1, new long[] {1, -63, 63}, new long[] {148, 9155, 567444});
  }
}
