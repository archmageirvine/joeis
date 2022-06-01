package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190959 a(n) = 3*a(n-1) - 5*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190959() {
    super(new long[] {-5, 3}, new long[] {0, 1});
  }
}
