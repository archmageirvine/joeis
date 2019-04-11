package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168298 <code>a(n) = 1 - n^2*2^n</code>.
 * @author Sean A. Irvine
 */
public class A168298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168298() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, -1, -15, -71});
  }
}
