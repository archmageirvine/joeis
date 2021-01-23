package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287405 a(n) = (7*(cot(1*Pi/7))^2)^n + (7*(cot(2*Pi/7))^2)^n + (7*(cot(4*Pi/7))^2)^n.
 * @author Sean A. Irvine
 */
public class A287405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287405() {
    super(new long[] {49, -147, 35}, new long[] {3, 35, 931});
  }
}
