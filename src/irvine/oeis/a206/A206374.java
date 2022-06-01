package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206374 a(n) = (7*4^n - 1)/3.
 * @author Sean A. Irvine
 */
public class A206374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206374() {
    super(new long[] {-4, 5}, new long[] {2, 9});
  }
}
