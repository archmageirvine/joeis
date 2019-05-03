package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252115 Numbers n such that the sum of the heptagonal numbers <code>H(n), H(n+1)</code> and <code>H(n+2)</code> is equal to the pentagonal number <code>P(m)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252115() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {573, 26951, 59482389, 2794406159L, 6167253128301L});
  }
}
