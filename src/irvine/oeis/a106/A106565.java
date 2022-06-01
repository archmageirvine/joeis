package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106565 a(n) = 5*a(n-1) + 5*a(n-2) with a(0) = 0, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A106565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106565() {
    super(new long[] {5, 5}, new long[] {0, 5});
  }
}
