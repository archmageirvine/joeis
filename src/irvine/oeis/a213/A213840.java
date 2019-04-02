package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213840 a(n) = n*(1 + n)*(3 - 4*n + 4*n^2)/6.
 * @author Sean A. Irvine
 */
public class A213840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213840() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 11, 54, 170, 415});
  }
}
