package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079825 Sum of numbers in n-th upward diagonal of triangle in A079826.
 * @author Sean A. Irvine
 */
public class A079825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079825() {
    super(1, new long[] {-1, 1, 1, -1, 2, -2, -2, 2, -1, 1, 1}, new long[] {1, 3, 6, 15, 26, 41, 62, 92, 129, 169, 224});
  }
}
