package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099588 Coefficient of x^2 in (1+x)^n mod 1+x^4.
 * @author Sean A. Irvine
 */
public class A099588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099588() {
    super(new long[] {-2, 4, -6, 4}, new long[] {0, 0, 1, 3});
  }
}
