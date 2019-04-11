package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081182 5th binomial transform of <code>(0,1,0,2,0,4,0,8,0,16,</code>...).
 * @author Sean A. Irvine
 */
public class A081182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081182() {
    super(new long[] {-23, 10}, new long[] {0, 1});
  }
}
