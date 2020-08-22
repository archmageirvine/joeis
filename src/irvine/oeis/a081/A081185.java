package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081185 8th binomial transform of (0,1,0,2,0,4,0,8,0,16,...).
 * @author Sean A. Irvine
 */
public class A081185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081185() {
    super(new long[] {-62, 16}, new long[] {0, 1});
  }
}
