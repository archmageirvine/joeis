package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268896 Start at a(0)=1. a(n) = a(n-1)+2 if n == 1,2 (mod 3) and a(n)=a(n-1)+a(n-3) if n == 0 (mod 3).
 * @author Sean A. Irvine
 */
public class A268896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268896() {
    super(new long[] {-2, 0, 0, 3, 0, 0}, new long[] {1, 3, 5, 6, 8, 10});
  }
}
