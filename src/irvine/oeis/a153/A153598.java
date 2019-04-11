package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153598 <code>a(n) = ((7 + sqrt(3))^n - (7 - sqrt(3))^n)/(2*sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A153598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153598() {
    super(new long[] {-46, 14}, new long[] {1, 14});
  }
}
