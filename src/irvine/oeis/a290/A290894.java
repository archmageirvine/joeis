package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290894 p-INVERT of the positive integers, where <code>p(S) = 1 - S^6</code>.
 * @author Sean A. Irvine
 */
public class A290894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290894() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -923, 792, -495, 220, -66, 12}, new long[] {0, 0, 0, 0, 0, 1, 12, 78, 364, 1365, 4368, 12377});
  }
}
