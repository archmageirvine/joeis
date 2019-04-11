package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144335 Row sums of triangle A144334, binomial transform of <code>[1, 2, 6, 7, 3, 0, 0, 0,</code>...].
 * @author Sean A. Irvine
 */
public class A144335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144335() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 11, 32, 76});
  }
}
