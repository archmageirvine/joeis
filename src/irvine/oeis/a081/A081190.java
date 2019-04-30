package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081190 8th binomial transform of <code>(1,0,1,0,1,.....)</code>, A059841.
 * @author Sean A. Irvine
 */
public class A081190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081190() {
    super(new long[] {-63, 16}, new long[] {1, 8});
  }
}
