package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261893 a(n) = (n+1)^3 - n^2.
 * @author Sean A. Irvine
 */
public class A261893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261893() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 23, 55});
  }
}
