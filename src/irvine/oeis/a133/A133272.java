package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133272.
 * @author Sean A. Irvine
 */
public class A133272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133272() {
    super(new long[] {1, -13, 13}, new long[] {1, 7, 78});
  }
}
