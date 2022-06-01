package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257199 a(n) =  n*(n+1)*(n+2)*(n^2+2*n+17)/120.
 * @author Sean A. Irvine
 */
public class A257199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257199() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 5, 16, 41, 91, 182});
  }
}
