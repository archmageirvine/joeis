package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114964 <code>a(n) = n^2 + 30</code>.
 * @author Sean A. Irvine
 */
public class A114964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114964() {
    super(new long[] {1, -3, 3}, new long[] {30, 31, 34});
  }
}
