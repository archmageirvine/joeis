package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110654 <code>a(n) = ceiling(n/2)</code>, or: <code>a(2*k) = k, a(2*k+1) = k+1</code>.
 * @author Sean A. Irvine
 */
public class A110654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110654() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 1});
  }
}
