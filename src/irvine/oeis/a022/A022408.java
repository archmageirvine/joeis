package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022408 a(n) = a(n-1) + a(n-2) + 1, with a(0)=3, a(1)=9.
 * @author Sean A. Irvine
 */
public class A022408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022408() {
    super(new long[] {-1, 0, 2}, new long[] {3, 9, 13});
  }
}
