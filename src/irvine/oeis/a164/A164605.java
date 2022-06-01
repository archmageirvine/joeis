package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164605 a(n) = ((1+4*sqrt(2))*(4+2*sqrt(2))^n + (1-4*sqrt(2))*(4-2*sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164605() {
    super(new long[] {-8, 8}, new long[] {1, 20});
  }
}
