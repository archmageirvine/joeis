package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291021 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - S - S^2 - S^3 + S^4 + S^5.
 * @author Sean A. Irvine
 */
public class A291021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291021() {
    super(new long[] {2, -9, 14, -13, 6}, new long[] {1, 3, 9, 25, 67});
  }
}
