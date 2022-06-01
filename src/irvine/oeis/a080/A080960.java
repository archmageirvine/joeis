package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080960 Third binomial transform of A010685 (period 2: repeat 1,4).
 * @author Sean A. Irvine
 */
public class A080960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080960() {
    super(new long[] {-8, 6}, new long[] {1, 7});
  }
}
