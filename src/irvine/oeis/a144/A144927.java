package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144927 Numbers n such that there exists an integer k with (n+7)^3-n^3=k^2.
 * @author Sean A. Irvine
 */
public class A144927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144927() {
    super(1, new long[] {1, -111, 111}, new long[] {7, 1162, 128191});
  }
}
