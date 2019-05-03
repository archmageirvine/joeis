package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216243 Partial sums of the squares of Lucas numbers <code>(A000032)</code>.
 * @author Sean A. Irvine
 */
public class A216243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216243() {
    super(new long[] {1, -3, 0, 3}, new long[] {4, 5, 14, 30});
  }
}
