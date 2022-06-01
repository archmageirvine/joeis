package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164031 a(n) = ((2+3*sqrt(2))*(5+sqrt(2))^n+(2-3*sqrt(2))*(5-sqrt(2))^n)/4.
 * @author Sean A. Irvine
 */
public class A164031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164031() {
    super(new long[] {-23, 10}, new long[] {1, 8});
  }
}
