package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253068 The subsequence A253066(2^n-1).
 * @author Sean A. Irvine
 */
public class A253068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253068() {
    super(new long[] {-8, 6, 3}, new long[] {1, 6, 28});
  }
}
