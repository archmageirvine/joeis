package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190955 a(n) = 10*a(n-1) + 5*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190955() {
    super(new long[] {5, 10}, new long[] {0, 1});
  }
}
