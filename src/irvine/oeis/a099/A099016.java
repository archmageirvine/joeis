package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099016 a(n) = 3*L(2*n)/5 - (-1)^n/5, where L = A000032.
 * @author Sean A. Irvine
 */
public class A099016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099016() {
    super(new long[] {-1, 2, 2}, new long[] {1, 2, 4});
  }
}
