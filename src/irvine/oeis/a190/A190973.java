package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190973 a(n) = 7*a(n-1) - 4*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190973() {
    super(new long[] {-4, 7}, new long[] {0, 1});
  }
}
