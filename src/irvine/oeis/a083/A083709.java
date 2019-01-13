package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083709.
 * @author Sean A. Irvine
 */
public class A083709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083709() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {1, 0, 4, 5, 13, 17, 33, 41});
  }
}
