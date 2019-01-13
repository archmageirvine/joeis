package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287701.
 * @author Sean A. Irvine
 */
public class A287701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287701() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 2252, 111753, 1297504, 7120505});
  }
}
