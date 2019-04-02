package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081106 6th binomial transform of (1,1,0,0,0,0,...).
 * @author Sean A. Irvine
 */
public class A081106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081106() {
    super(new long[] {-36, 12}, new long[] {1, 7});
  }
}
