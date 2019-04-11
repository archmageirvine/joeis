package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114220 <code>a(n) =</code> Sum_{k=0..floor(n/2)} <code>k-(k-1)*0^(n-2k)</code>.
 * @author Sean A. Irvine
 */
public class A114220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114220() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 0, 1, 1, 2});
  }
}
