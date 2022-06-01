package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278131 a(n) = 591*2^n - 273.
 * @author Sean A. Irvine
 */
public class A278131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278131() {
    super(new long[] {-2, 3}, new long[] {318, 909});
  }
}
