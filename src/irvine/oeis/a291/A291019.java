package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291019 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - S - S^2 - S^3 + S^4.
 * @author Sean A. Irvine
 */
public class A291019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291019() {
    super(new long[] {-3, 6, -8, 5}, new long[] {1, 3, 9, 25});
  }
}
