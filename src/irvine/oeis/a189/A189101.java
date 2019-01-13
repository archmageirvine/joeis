package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189101.
 * @author Sean A. Irvine
 */
public class A189101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189101() {
    super(new long[] {1, 1, 0, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 15, 30});
  }
}
