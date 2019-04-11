package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269255 <code>a(n) = (2^(2*n+1) - 1)*(3^(n+1) - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A269255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269255() {
    super(new long[] {-144, 240, -115, 20}, new long[] {1, 28, 403, 5080});
  }
}
