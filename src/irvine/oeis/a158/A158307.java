package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158307 361n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158307() {
    super(1, new long[] {1, -3, 3}, new long[] {359, 1440, 3243});
  }
}
