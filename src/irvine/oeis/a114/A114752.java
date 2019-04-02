package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114752 a(2n)=2n, a(2n+1)=4n+1.
 * @author Sean A. Irvine
 */
public class A114752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114752() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 5, 4});
  }
}
