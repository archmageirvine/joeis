package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003269.
 * @author Sean A. Irvine
 */
public class A003269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003269() {
    super(new long[] {1, 0, 0, 1}, new long[] {0, 1, 1, 1});
  }
}
