package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153597 a(n) = ((6 + sqrt(3))^n - (6 - sqrt(3))^n)/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A153597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153597() {
    super(new long[] {-33, 12}, new long[] {1, 12});
  }
}
