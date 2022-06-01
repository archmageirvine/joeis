package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097065 Interleave n+1 and n-1.
 * @author Sean A. Irvine
 */
public class A097065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097065() {
    super(new long[] {-1, 1, 1}, new long[] {1, -1, 2});
  }
}
