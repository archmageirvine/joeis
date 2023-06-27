package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072277 Smallest integer &gt; 1 which is both n-gonal and centered n-gonal.
 * @author Sean A. Irvine
 */
public class A072277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072277() {
    super(3, new long[] {-1, 4, -6, 4}, new long[] {10, 25, 51, 91});
  }
}
