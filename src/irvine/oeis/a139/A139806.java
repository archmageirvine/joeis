package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139806 a(n)=a(n-1)+a(n-2)+a(n-3)+2a(n-4), a(0)=1, a(1)=3, a(2)=7, a(3)=15.
 * @author Sean A. Irvine
 */
public class A139806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139806() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 3, 7, 15});
  }
}
