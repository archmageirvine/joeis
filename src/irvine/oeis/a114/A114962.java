package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114962.
 * @author Sean A. Irvine
 */
public class A114962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114962() {
    super(new long[] {1, -3, 3}, new long[] {14, 15, 18});
  }
}
