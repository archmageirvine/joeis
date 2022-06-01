package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232713 Doubly pentagonal numbers: a(n) = n*(3*n-2)*(3*n-1)*(3*n+1)/8.
 * @author Sean A. Irvine
 */
public class A232713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232713() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 35, 210, 715});
  }
}
