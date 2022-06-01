package irvine.oeis.a180;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A180847 a(n) = (27^n-4^n)/23.
 * @author Sean A. Irvine
 */
public class A180847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180847() {
    super(new long[] {-108, 31}, new long[] {0, 1});
  }
}
