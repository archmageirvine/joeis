package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027982 <code>Sum{(k+1)*T(n,2n-k)}, 0&lt;=k&lt;=2n</code>, T given by <code>A027960</code>.
 * @author Sean A. Irvine
 */
public class A027982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027982() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 10, 38, 108});
  }
}
