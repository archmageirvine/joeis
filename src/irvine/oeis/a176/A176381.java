package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176381 y-values in the solution to x^2-71*y^2=1.
 * @author Sean A. Irvine
 */
public class A176381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176381() {
    super(new long[] {-1, 6960}, new long[] {0, 413});
  }
}
