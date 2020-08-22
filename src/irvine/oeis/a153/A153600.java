package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153600 a(n) = ((9 + sqrt(3))^n - (9 - sqrt(3))^n)/(2*sqrt(3)).
 * @author Sean A. Irvine
 */
public class A153600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153600() {
    super(new long[] {-78, 18}, new long[] {1, 18});
  }
}
