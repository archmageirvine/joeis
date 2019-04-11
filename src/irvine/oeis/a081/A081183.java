package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081183 6th binomial transform of <code>(0,1,0,2,0,4,0,8,0,16,</code>...).
 * @author Sean A. Irvine
 */
public class A081183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081183() {
    super(new long[] {-34, 12}, new long[] {0, 1});
  }
}
