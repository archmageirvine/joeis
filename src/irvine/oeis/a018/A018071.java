package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018071.
 * @author Sean A. Irvine
 */
public class A018071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018071() {
    super(new long[] {288, -156, 23}, new long[] {1, 23, 373});
  }
}
