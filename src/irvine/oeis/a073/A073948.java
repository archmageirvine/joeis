package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073948 Number of strings over Z_3 of length n with trace 0 and subtrace 1.
 * @author Sean A. Irvine
 */
public class A073948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073948() {
    super(1, new long[] {27, -36, 27, -15, 6}, new long[] {0, 0, 0, 6, 30});
  }
}
