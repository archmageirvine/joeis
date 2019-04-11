package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114243 <code>a(n) = (n+1)(n+2)^2*(n+3)(n+4)(3n+5)/240</code>.
 * @author Sean A. Irvine
 */
public class A114243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114243() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 12, 66, 245, 714, 1764, 3864});
  }
}
