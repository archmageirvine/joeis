package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218471.
 * @author Sean A. Irvine
 */
public class A218471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218471() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 11});
  }
}
