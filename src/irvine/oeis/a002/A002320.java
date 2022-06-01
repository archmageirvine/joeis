package irvine.oeis.a002;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A002320 a(n) = 5*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A002320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002320() {
    super(new long[] {-1, 5}, new long[] {1, 3});
  }
}
