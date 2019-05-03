package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290917 p-INVERT of the positive integers, where <code>p(S) = (1 - S)^2</code>.
 * @author Sean A. Irvine
 */
public class A290917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290917() {
    super(new long[] {-1, 6, -11, 6}, new long[] {2, 7, 22, 67});
  }
}
