package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174836 a(n) = 1 + ((6*n-1)*2^n + (-1)^n)/3.
 * @author Sean A. Irvine
 */
public class A174836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174836() {
    super(new long[] {4, -4, -3, 4}, new long[] {1, 4, 16, 46});
  }
}
