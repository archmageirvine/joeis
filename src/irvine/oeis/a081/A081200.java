package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081200 6th binomial transform of (0,1,0,1,0,1,....), A000035.
 * @author Sean A. Irvine
 */
public class A081200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081200() {
    super(new long[] {-35, 12}, new long[] {0, 1});
  }
}
