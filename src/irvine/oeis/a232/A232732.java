package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232732 Sum_{k=0,...,2n} <code>(-1)^k</code> binomial(12*n,6*k).
 * @author Sean A. Irvine
 */
public class A232732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232732() {
    super(new long[] {-64, -172929, -2766}, new long[] {-922, 2434966, -6575675482L});
  }
}
