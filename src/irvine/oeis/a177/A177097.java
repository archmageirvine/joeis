package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177097 a(n) = 6*(10^n-5).
 * @author Sean A. Irvine
 */
public class A177097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177097() {
    super(1, new long[] {-10, 11}, new long[] {30, 570});
  }
}
