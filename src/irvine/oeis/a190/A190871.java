package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190871 a(n) = 11*a(n-1) - 11*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190871() {
    super(new long[] {-11, 11}, new long[] {0, 1});
  }
}
