package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081138 8th binomial transform of (0,0,1,0,0,0, ...).
 * @author Sean A. Irvine
 */
public class A081138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081138() {
    super(new long[] {512, -192, 24}, new long[] {0, 0, 1});
  }
}
