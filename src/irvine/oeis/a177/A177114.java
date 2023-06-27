package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177114 4*(10^n-9).
 * @author Sean A. Irvine
 */
public class A177114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177114() {
    super(1, new long[] {-10, 11}, new long[] {4, 364});
  }
}
