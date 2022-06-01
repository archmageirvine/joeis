package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022015 a(n)=2a(n-1)+3a(n-2)+2a(n-3)+3a(n-4).
 * @author Sean A. Irvine
 */
public class A022015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022015() {
    super(new long[] {3, 2, 3, 2}, new long[] {2, 6, 19, 61});
  }
}
