package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083584 a(n) = (8*4^n - 5)/3.
 * @author Sean A. Irvine
 */
public class A083584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083584() {
    super(new long[] {-4, 5}, new long[] {1, 9});
  }
}
