package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051836 a(n) = n*(n+1)*(n+2)*(n+3)*(3*n+2)/120.
 * @author Sean A. Irvine
 */
public class A051836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051836() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 8, 33, 98, 238});
  }
}
