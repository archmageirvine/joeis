package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153597 <code>a(n) = ((6 + sqrt(3))^n - (6 - sqrt(3))^n)/(2*sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A153597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153597() {
    super(new long[] {-33, 12}, new long[] {1, 12});
  }
}
