package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101455 <code>a(n) = 0</code> for even n, <code>a(n) = (-1)^((n-1)/2)</code> for odd n. Periodic sequence 1,0,-1,0,...
 * @author Sean A. Irvine
 */
public class A101455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101455() {
    super(new long[] {-1, 0}, new long[] {1, 0});
  }
}
