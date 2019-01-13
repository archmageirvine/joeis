package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114753.
 * @author Sean A. Irvine
 */
public class A114753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114753() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 3, 3, 7});
  }
}
