package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124502 a(1)=a(2)=1; thereafter, a(n+1) = a(n) + a(n-1) + 1 if n is a multiple of 5, otherwise a(n+1) = a(n) + a(n-1).
 * @author Sean A. Irvine
 */
public class A124502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124502() {
    super(1, new long[] {-1, -1, 1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 9, 14});
  }
}
