package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164033 a(n) = ((4+3*sqrt(2))*(3+sqrt(2))^n + (4-3*sqrt(2))*(3-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A164033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164033() {
    super(new long[] {-7, 6}, new long[] {2, 9});
  }
}
