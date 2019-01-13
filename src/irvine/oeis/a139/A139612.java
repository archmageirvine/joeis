package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139612.
 * @author Sean A. Irvine
 */
public class A139612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139612() {
    super(new long[] {-1, 2}, new long[] {12, 78});
  }
}
