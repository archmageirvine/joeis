package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198766 a(n) = (7*5^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A198766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198766() {
    super(new long[] {-5, 6}, new long[] {3, 17});
  }
}
