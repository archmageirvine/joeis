package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139800 a(n)=a(n-1)+a(n-2)+a(n-3)+2a(n-4).
 * @author Sean A. Irvine
 */
public class A139800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139800() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 0, 0, 0});
  }
}
