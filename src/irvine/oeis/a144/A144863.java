package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144863 Start with <code>1,</code> then at each step prepend 10 and append 01.
 * @author Sean A. Irvine
 */
public class A144863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144863() {
    super(new long[] {-10000, 10001}, new long[] {1, 10101});
  }
}
