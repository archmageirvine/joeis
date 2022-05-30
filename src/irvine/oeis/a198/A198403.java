package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198403 a(n) = 6^n * n^6.
 * @author Sean A. Irvine
 */
public class A198403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198403() {
    super(new long[] {279936, -326592, 163296, -45360, 7560, -756, 42}, new long[] {0, 6, 2304, 157464, 5308416, 121500000, 2176782336L});
  }
}
