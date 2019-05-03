package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081045 <code>10th</code> binomial transform of <code>(1,9,0,0,0,0,0,.....)</code>.
 * @author Sean A. Irvine
 */
public class A081045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081045() {
    super(new long[] {-100, 20}, new long[] {1, 19});
  }
}
