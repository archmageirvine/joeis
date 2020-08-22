package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155623 a(n) = 11^n + 3^n - 1.
 * @author Sean A. Irvine
 */
public class A155623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155623() {
    super(new long[] {33, -47, 15}, new long[] {1, 13, 129});
  }
}
