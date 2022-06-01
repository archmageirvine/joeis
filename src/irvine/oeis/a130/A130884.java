package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130884 3n^3 + 2n^2 + n + 1.
 * @author Sean A. Irvine
 */
public class A130884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130884() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 35, 103});
  }
}
