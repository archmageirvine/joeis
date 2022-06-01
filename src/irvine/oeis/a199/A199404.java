package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199404 x-values in the solution to 13*x^2 - 12 = y^2.
 * @author Sean A. Irvine
 */
public class A199404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199404() {
    super(new long[] {-1, 0, 11, 0}, new long[] {1, 4, 7, 43});
  }
}
