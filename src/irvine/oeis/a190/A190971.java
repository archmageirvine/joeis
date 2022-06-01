package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190971 a(n) = 5*a(n-1) - 10*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190971() {
    super(new long[] {-10, 5}, new long[] {0, 1});
  }
}
