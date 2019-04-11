package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081180 4th binomial transform of <code>(0,1,0,2,0,4,0,8,0,16,</code>...).
 * @author Sean A. Irvine
 */
public class A081180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081180() {
    super(new long[] {-14, 8}, new long[] {0, 1});
  }
}
