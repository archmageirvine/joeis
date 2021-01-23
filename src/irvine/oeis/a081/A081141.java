package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081141 11th binomial transform of (0,0,1,0,0,0,...).
 * @author Sean A. Irvine
 */
public class A081141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081141() {
    super(new long[] {1331, -363, 33}, new long[] {0, 0, 1});
  }
}
