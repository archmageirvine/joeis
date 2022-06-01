package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292360 a(n) = n*(Lucas(n)*Lucas(n+1) - 2).
 * @author Sean A. Irvine
 */
public class A292360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292360() {
    super(new long[] {-1, 6, -9, -6, 20, -6, -9, 6}, new long[] {0, 1, 20, 78, 300, 980, 3120, 9527});
  }
}
