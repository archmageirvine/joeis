package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264850 a(n) = n*(n + 1)*(n + 2)*(7*n - 5)/12.
 * @author Sean A. Irvine
 */
public class A264850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264850() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 18, 80, 230});
  }
}
