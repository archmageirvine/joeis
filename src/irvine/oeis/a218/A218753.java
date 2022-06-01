package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218753 a(n) = (49^n-1)/48.
 * @author Sean A. Irvine
 */
public class A218753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218753() {
    super(new long[] {-49, 50}, new long[] {0, 1});
  }
}
