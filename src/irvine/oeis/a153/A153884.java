package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153884 <code>a(n) = ((7 + sqrt(5))^n - (7 - sqrt(5))^n)/(2*sqrt(5))</code>.
 * @author Sean A. Irvine
 */
public class A153884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153884() {
    super(new long[] {-44, 14}, new long[] {1, 14});
  }
}
