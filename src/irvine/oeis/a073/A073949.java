package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073949 Number of strings over Z_3 of length n with trace 0 and subtrace 2.
 * @author Sean A. Irvine
 */
public class A073949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073949() {
    super(new long[] {27, -36, 27, -15, 6}, new long[] {0, 2, 6, 12, 30});
  }
}
