package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202606 Ceiling(((10^n <code>- 1)^2/9 + 10^n)/18)</code>.
 * @author Sean A. Irvine
 */
public class A202606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202606() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 2, 67});
  }
}
