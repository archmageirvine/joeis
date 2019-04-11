package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144965 <code>a(n) = 4*n*(4*n^2+1)</code>.
 * @author Sean A. Irvine
 */
public class A144965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144965() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 20, 136, 444});
  }
}
