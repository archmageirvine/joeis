package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154324 Diagonal sums of number triangle <code>A113582</code>.
 * @author Sean A. Irvine
 */
public class A154324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154324() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {1, 1, 2, 3, 6, 12, 23, 43, 74});
  }
}
