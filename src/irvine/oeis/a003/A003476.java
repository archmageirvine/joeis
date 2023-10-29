package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003476 a(n) = a(n-1) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A003476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003476() {
    super(1, new long[] {2, 0, 1}, new long[] {1, 2, 3});
  }
}

