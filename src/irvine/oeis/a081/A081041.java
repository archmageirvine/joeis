package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081041 6th binomial transform of <code>(1,5,0,0,0,0,0,0,</code>.....).
 * @author Sean A. Irvine
 */
public class A081041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081041() {
    super(new long[] {-36, 12}, new long[] {1, 11});
  }
}
