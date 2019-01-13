package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258000.
 * @author Sean A. Irvine
 */
public class A258000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258000() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 14, 26, 48, 89});
  }
}
