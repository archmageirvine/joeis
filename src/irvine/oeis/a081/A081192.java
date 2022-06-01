package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081192 10th binomial transform of (1,0,1,0,1,......), A059841.
 * @author Sean A. Irvine
 */
public class A081192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081192() {
    super(new long[] {-99, 20}, new long[] {1, 10});
  }
}
