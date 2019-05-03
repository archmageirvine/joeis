package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191370 <code>a(n) = 2*(1+(-1)^n)/3 + 2*A010892(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A191370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191370() {
    super(new long[] {2, -1, 0, 2}, new long[] {1, 2, 4, 2});
  }
}
