package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081136 6th binomial transform of <code>(0,0,1,0,0,0,</code>........).
 * @author Sean A. Irvine
 */
public class A081136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081136() {
    super(new long[] {216, -108, 18}, new long[] {0, 0, 1});
  }
}
