package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144929 Numbers n such that there exists an integer k with <code>(n+1)^3 - n^3 = 7*k^2</code>.
 * @author Sean A. Irvine
 */
public class A144929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144929() {
    super(new long[] {1, -111, 111}, new long[] {1, 166, 18313});
  }
}
