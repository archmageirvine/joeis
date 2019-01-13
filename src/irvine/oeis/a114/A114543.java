package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114543.
 * @author Sean A. Irvine
 */
public class A114543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114543() {
    super(new long[] {1536, 772, 0}, new long[] {0, 1, 1});
  }
}
