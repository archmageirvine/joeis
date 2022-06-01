package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081187 5th binomial transform of (1,0,1,0,1,...), A059841.
 * @author Sean A. Irvine
 */
public class A081187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081187() {
    super(new long[] {-24, 10}, new long[] {1, 5});
  }
}
