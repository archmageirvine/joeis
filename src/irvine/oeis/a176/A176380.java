package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176380 x-values in the solution to x^2-71*y^2=1.
 * @author Sean A. Irvine
 */
public class A176380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176380() {
    super(1, new long[] {-1, 6960}, new long[] {1, 3480});
  }
}
