package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073952 Number of strings over Z_3 of length n with trace 1 and subtrace 2.
 * @author Sean A. Irvine
 */
public class A073952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073952() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {0, 0, 3, 12, 30});
  }
}
