package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097108.
 * @author Sean A. Irvine
 */
public class A097108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097108() {
    super(new long[] {1, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0}, new long[] {1, 2, 3, 6, 9, 9, 16, 20, 18, 30, 36, 30});
  }
}
