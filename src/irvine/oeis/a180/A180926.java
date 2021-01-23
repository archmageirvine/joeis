package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180926 Numbers a(n) such that 6*a(n) and 10*a(n) are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A180926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180926() {
    super(new long[] {1, -63, 63}, new long[] {0, 1, 63});
  }
}
