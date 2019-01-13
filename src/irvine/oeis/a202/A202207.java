package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202207.
 * @author Sean A. Irvine
 */
public class A202207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202207() {
    super(new long[] {1, -1, 3}, new long[] {1, 2, 5});
  }
}
