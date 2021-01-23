package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164300 a(n) = ((1+4*sqrt(2))*(4+sqrt(2))^n + (1-4*sqrt(2))*(4-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A164300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164300() {
    super(new long[] {-14, 8}, new long[] {1, 12});
  }
}
