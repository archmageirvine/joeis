package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277978.
 * @author Sean A. Irvine
 */
public class A277978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277978() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 30});
  }
}
