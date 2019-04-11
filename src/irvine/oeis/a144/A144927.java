package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144927 Numbers n such that there exists an integer k with <code>(n+7)^3-n^3=k^2</code>.
 * @author Sean A. Irvine
 */
public class A144927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144927() {
    super(new long[] {1, -111, 111}, new long[] {7, 1162, 128191});
  }
}
