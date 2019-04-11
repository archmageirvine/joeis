package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097065 Interleave <code>n+1</code> and <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A097065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097065() {
    super(new long[] {-1, 1, 1}, new long[] {1, -1, 2});
  }
}
