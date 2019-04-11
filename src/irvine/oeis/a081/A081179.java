package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081179 3rd binomial transform of <code>(0,1,0,2,0,4,0,8,0,16,...)</code>.
 * @author Sean A. Irvine
 */
public class A081179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081179() {
    super(new long[] {-7, 6}, new long[] {0, 1});
  }
}
