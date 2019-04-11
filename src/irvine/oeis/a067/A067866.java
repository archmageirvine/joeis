package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067866 Numbers n such that n and <code>2^n</code> end with the same three digits.
 * @author Sean A. Irvine
 */
public class A067866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067866() {
    super(new long[] {-1, 2}, new long[] {736, 1736});
  }
}
