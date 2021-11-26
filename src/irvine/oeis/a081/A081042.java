package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081042 7th binomial transform of (1,6,0,0,0,0,0,0,...).
 * @author Sean A. Irvine
 */
public class A081042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081042() {
    super(new long[] {-49, 14}, new long[] {1, 13});
  }
}
