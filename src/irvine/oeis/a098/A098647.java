package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098647 Trace sequence associated to the 4 X 4 Krawtchouk matrix and its transpose.
 * @author Sean A. Irvine
 */
public class A098647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098647() {
    super(new long[] {-64, 24}, new long[] {1, 12});
  }
}
