package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056109.
 * @author Sean A. Irvine
 */
public class A056109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056109() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 17});
  }
}
