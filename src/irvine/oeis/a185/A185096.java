package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185096 Let T(n) = n(n+1)/2 be the n-th triangular number (A000217); a(n) = T(8T(n)).
 * @author Sean A. Irvine
 */
public class A185096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185096() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 36, 300, 1176, 3240});
  }
}
