package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195084 <code>a(2n-1) = 2-n, a(2n) = 2+n</code>.
 * @author Sean A. Irvine
 */
public class A195084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195084() {
    super(new long[] {1, 1, -1}, new long[] {1, 3, 0});
  }
}
