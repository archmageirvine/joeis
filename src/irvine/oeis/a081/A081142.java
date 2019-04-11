package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081142 12th binomial transform of <code>(0,0,1,0,0,0,...)</code>.
 * @author Sean A. Irvine
 */
public class A081142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081142() {
    super(new long[] {1728, -432, 36}, new long[] {0, 0, 1});
  }
}
