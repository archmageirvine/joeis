package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081202 8th binomial transform of <code>(0,1,0,1,0,1,</code>....), A000035.
 * @author Sean A. Irvine
 */
public class A081202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081202() {
    super(new long[] {-63, 16}, new long[] {0, 1});
  }
}
