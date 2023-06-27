package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144863 Start with 1, then at each step prepend 10 and append 01.
 * @author Sean A. Irvine
 */
public class A144863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144863() {
    super(1, new long[] {-10000, 10001}, new long[] {1, 10101});
  }
}
