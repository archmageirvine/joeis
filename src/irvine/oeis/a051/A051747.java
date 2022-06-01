package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051747 a(n) = n*(n+1)*(n+2)*(n^2+7*n+32)/120.
 * @author Sean A. Irvine
 */
public class A051747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051747() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 10, 31, 76, 161, 308});
  }
}
