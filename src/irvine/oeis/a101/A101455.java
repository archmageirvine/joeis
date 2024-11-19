package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101455 a(n) = 0 for even n, a(n) = (-1)^((n-1)/2) for odd n. Periodic sequence 1,0,-1,0,...
 * @author Sean A. Irvine
 */
public class A101455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101455() {
    super(0, new long[] {-1, 0}, new long[] {0, 1});
  }
}
