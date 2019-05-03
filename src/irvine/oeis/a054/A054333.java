package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054333 1/256 of tenth unsigned column of triangle <code>A053120 (T-Chebyshev</code>, rising powers, zeros omitted).
 * @author Sean A. Irvine
 */
public class A054333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054333() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 11, 65, 275, 935, 2717, 7007, 16445, 35750, 72930});
  }
}
