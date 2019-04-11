package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153599 <code>a(n) = ((8 + sqrt(3))^n - (8 - sqrt(3))^n)/(2*sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A153599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153599() {
    super(new long[] {-61, 16}, new long[] {1, 16});
  }
}
