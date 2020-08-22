package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130885 3n^3 - 2n^2 + n - 1.
 * @author Sean A. Irvine
 */
public class A130885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130885() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 17, 65, 163});
  }
}
