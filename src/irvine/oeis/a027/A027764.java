package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027764 <code>a(n) = (n+1)*binomial(n+1,4)</code>.
 * @author Sean A. Irvine
 */
public class A027764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027764() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {4, 25, 90, 245, 560, 1134});
  }
}
