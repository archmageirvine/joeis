package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190961 a(n) = 3*a(n-1) - 7*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190961() {
    super(new long[] {-7, 3}, new long[] {0, 1});
  }
}
