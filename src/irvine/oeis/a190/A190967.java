package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190967 a(n) = 4*a(n-1) - 9*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190967() {
    super(new long[] {-9, 4}, new long[] {0, 1});
  }
}
