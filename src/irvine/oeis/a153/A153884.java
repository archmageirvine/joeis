package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153884 a(n) = ((7 + sqrt(5))^n - (7 - sqrt(5))^n)/(2*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A153884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153884() {
    super(1, new long[] {-44, 14}, new long[] {1, 14});
  }
}
