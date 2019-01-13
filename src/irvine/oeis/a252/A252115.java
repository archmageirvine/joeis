package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252115.
 * @author Sean A. Irvine
 */
public class A252115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252115() {
    super(new long[] {1, -1, -103682, 103682, 1}, new long[] {573, 26951, 59482389, 2794406159L, 6167253128301L});
  }
}
