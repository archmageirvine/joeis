package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176380 x-values in the solution to <code>x^2-71*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176380() {
    super(new long[] {-1, 6960}, new long[] {1, 3480});
  }
}
