package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212704 a(n) = 9*n*10^(n-1).
 * @author Sean A. Irvine
 */
public class A212704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212704() {
    super(new long[] {-100, 20}, new long[] {9, 180});
  }
}
