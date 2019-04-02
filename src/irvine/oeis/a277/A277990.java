package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277990 a(n) = 54*n^2 + 6*n.
 * @author Sean A. Irvine
 */
public class A277990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277990() {
    super(new long[] {1, -3, 3}, new long[] {0, 60, 228});
  }
}
