package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190963 a(n) = 3*a(n-1) - 9*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190963() {
    super(new long[] {-9, 3}, new long[] {0, 1});
  }
}
