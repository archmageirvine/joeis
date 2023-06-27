package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199405 y-values in the solution to 13*x^2 - 12 = y^2.
 * @author Sean A. Irvine
 */
public class A199405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199405() {
    super(1, new long[] {-1, 0, 11, 0}, new long[] {1, 14, 25, 155});
  }
}
