package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116966 a(n) = n + {1,2,0,1} according as n == {0,1,2,3} mod 4.
 * @author Sean A. Irvine
 */
public class A116966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116966() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 2, 4, 5});
  }
}
