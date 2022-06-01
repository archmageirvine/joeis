package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056107 Third spoke of a hexagonal spiral.
 * @author Sean A. Irvine
 */
public class A056107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056107() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 13});
  }
}
