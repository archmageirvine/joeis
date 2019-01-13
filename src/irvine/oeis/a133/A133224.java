package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133224.
 * @author Sean A. Irvine
 */
public class A133224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133224() {
    super(new long[] {-64, 96, -52, 12}, new long[] {0, 2, 14, 78});
  }
}
