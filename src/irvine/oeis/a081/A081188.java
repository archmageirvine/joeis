package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081188 6th binomial transform of (1,0,1,0,1,.....), A059841.
 * @author Sean A. Irvine
 */
public class A081188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081188() {
    super(new long[] {-35, 12}, new long[] {1, 6});
  }
}
