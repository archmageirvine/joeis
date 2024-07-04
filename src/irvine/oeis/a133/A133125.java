package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133125 a(n) =  (7*3^n - (-3)^n)/6.
 * @author Sean A. Irvine
 */
public class A133125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133125() {
    super(new long[] {9, 0}, new long[] {1, 4});
  }
}
