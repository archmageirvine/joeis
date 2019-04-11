package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081135 5th binomial transform of <code>(0,0,1,0,0,0,...)</code>.
 * @author Sean A. Irvine
 */
public class A081135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081135() {
    super(new long[] {125, -75, 15}, new long[] {0, 0, 1});
  }
}
