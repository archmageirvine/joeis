package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081199 5th binomial transform of <code>(0,1,0,1,...), A000035</code>.
 * @author Sean A. Irvine
 */
public class A081199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081199() {
    super(new long[] {-24, 10}, new long[] {0, 1});
  }
}
