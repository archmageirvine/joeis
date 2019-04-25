package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198943 y-values in the solution to <code>10*x^2-9 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A198943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198943() {
    super(new long[] {-1, 0, 0, 38, 0, 0}, new long[] {1, 9, 41, 79, 351, 1559});
  }
}
