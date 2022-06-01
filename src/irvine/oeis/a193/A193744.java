package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193744 Partial sum of Perrin numbers.
 * @author Sean A. Irvine
 */
public class A193744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193744() {
    super(new long[] {-1, 0, 1, 1}, new long[] {3, 3, 5, 8});
  }
}
