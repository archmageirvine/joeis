package irvine.oeis.a252;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A252115 Numbers n such that the sum of the heptagonal numbers H(n), H(n+1) and H(n+2) is equal to the pentagonal number P(m) for some m.
 * @author Sean A. Irvine
 */
public class A252115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252115() {
    super(1, new long[] {1, -1, -103682, 103682, 1}, new long[] {573, 26951, 59482389, 2794406159L, 6167253128301L});
  }
}
