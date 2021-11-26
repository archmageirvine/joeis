package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081038 3rd binomial transform of (1,2,0,0,0,0,0,0,...).
 * @author Sean A. Irvine
 */
public class A081038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081038() {
    super(new long[] {-9, 6}, new long[] {1, 5});
  }
}
