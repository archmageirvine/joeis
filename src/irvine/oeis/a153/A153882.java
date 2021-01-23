package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153882 a(n) = ((6 + sqrt(5))^n - (6 - sqrt(5))^n)/(2*sqrt(5)).
 * @author Sean A. Irvine
 */
public class A153882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153882() {
    super(new long[] {-31, 12}, new long[] {1, 12});
  }
}
