package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114849.
 * @author Sean A. Irvine
 */
public class A114849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114849() {
    super(new long[] {1, -3, -28, 11}, new long[] {0, 3, 31, 257});
  }
}
