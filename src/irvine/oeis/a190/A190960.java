package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190960 a(n) = 3*a(n-1) - 6*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190960() {
    super(new long[] {-6, 3}, new long[] {0, 1});
  }
}
