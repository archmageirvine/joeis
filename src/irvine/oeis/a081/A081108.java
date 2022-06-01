package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081108 8th binomial transform of (1,1,0,0,0,0,.........).
 * @author Sean A. Irvine
 */
public class A081108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081108() {
    super(new long[] {-64, 16}, new long[] {1, 9});
  }
}
