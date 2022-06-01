package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114047 x such that x^2 - 13*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A114047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114047() {
    super(new long[] {-1, 1298}, new long[] {1, 649});
  }
}
