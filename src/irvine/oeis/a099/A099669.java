package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099669 Partial sums of repdigits of A002276.
 * @author Sean A. Irvine
 */
public class A099669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099669() {
    super(new long[] {10, -21, 12}, new long[] {2, 24, 246});
  }
}
