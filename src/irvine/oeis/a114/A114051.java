package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114051 x such that <code>x^2 -</code> 23*y^2 <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A114051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114051() {
    super(new long[] {-1, 48}, new long[] {1, 24});
  }
}
