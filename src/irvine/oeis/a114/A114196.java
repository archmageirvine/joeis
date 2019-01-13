package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114196.
 * @author Sean A. Irvine
 */
public class A114196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114196() {
    super(new long[] {-1, -8, 6}, new long[] {1, 3, 10});
  }
}
