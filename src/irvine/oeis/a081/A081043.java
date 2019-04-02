package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081043 8th binomial transform of (1,7,0,0,0,0,0,...).
 * @author Sean A. Irvine
 */
public class A081043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081043() {
    super(new long[] {-64, 16}, new long[] {1, 15});
  }
}
