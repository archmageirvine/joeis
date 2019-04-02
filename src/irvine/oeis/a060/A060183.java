package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060183 a(0)=1, a(n) = 100*a(n-1) + 36*n - 128.
 * @author Sean A. Irvine
 */
public class A060183 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060183() {
    super(new long[] {100, -201, 102}, new long[] {1, 8, 744});
  }
}
