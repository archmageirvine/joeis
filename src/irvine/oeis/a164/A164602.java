package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164602 a(n) = ((1+4*sqrt(2))*(1+2*sqrt(2))^n + (1-4*sqrt(2))*(1-2*sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164602() {
    super(new long[] {7, 2}, new long[] {1, 17});
  }
}
