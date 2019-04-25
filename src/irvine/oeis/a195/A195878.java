package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195878 y-values in the solution to <code>7*x^2-6 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A195878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195878() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 13, 29, 209});
  }
}
