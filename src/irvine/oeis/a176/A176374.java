package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176374 y-values in the solution to x^2 - 67*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A176374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176374() {
    super(1, new long[] {-1, 97684}, new long[] {0, 5967});
  }
}
