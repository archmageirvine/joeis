package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153885 a(n) = ((8 + sqrt(5))^n - (8 - sqrt(5))^n)/(2*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A153885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153885() {
    super(1, new long[] {-59, 16}, new long[] {1, 16});
  }
}
