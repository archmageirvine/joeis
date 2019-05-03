package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099676 Partial sums of repdigits of <code>A002283</code>.
 * @author Sean A. Irvine
 */
public class A099676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099676() {
    super(new long[] {10, -21, 12}, new long[] {9, 108, 1107});
  }
}
