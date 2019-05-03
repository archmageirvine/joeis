package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186424 Odd terms in <code>A186423</code>.
 * @author Sean A. Irvine
 */
public class A186424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186424() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 11, 17, 33});
  }
}
