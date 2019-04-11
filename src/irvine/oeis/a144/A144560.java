package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144560 Ten times hexagonal numbers: <code>10*n*(2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A144560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144560() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 60});
  }
}
