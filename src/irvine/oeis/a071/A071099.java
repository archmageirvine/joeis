package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071099 a(n) = (n-1)*(n+3) - 2^n + 4.
 * @author Sean A. Irvine
 */
public class A071099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071099() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 2, 5, 8});
  }
}
