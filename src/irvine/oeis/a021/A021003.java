package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021003 <code>a(n) = (n/2)*(n^4+1)</code>.
 * @author Sean A. Irvine
 */
public class A021003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021003() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 17, 123, 514, 1565});
  }
}
