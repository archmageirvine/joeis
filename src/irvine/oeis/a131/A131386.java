package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131386 a(n) = (-1)^n*n*(n-2).
 * @author Sean A. Irvine
 */
public class A131386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131386() {
    super(new long[] {-1, -3, -3}, new long[] {1, 0, -3});
  }
}
