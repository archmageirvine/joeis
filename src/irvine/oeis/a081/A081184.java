package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081184 7th binomial transform of (0,1,0,2,0,4,0,8,0,16,...).
 * @author Sean A. Irvine
 */
public class A081184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081184() {
    super(new long[] {-47, 14}, new long[] {0, 1});
  }
}
