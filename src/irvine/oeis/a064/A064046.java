package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064046 Number of length 6 walks on <code>an</code> n-dimensional hypercubic lattice starting and finishing at the origin and staying in the nonnegative part.
 * @author Sean A. Irvine
 */
public class A064046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064046() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 70, 285});
  }
}
