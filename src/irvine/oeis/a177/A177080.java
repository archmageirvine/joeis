package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177080 a(n) = 5*(10^n-7).
 * @author Sean A. Irvine
 */
public class A177080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177080() {
    super(1, new long[] {-10, 11}, new long[] {15, 465});
  }
}
