package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065928 (x,y) = (a(n),a(n+1)) are the solutions of (t(x)+t(y))/(1+xy)) = t(2) = 3, where t(n) denotes the n-th triangular number t(n) = n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A065928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065928() {
    super(new long[] {1, -7, 7}, new long[] {2, 11, 63});
  }
}
