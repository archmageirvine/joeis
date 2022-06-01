package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105839 Numbers n such that n^2 = 19*m^2 + 19*m + 1.
 * @author Sean A. Irvine
 */
public class A105839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105839() {
    super(new long[] {-1, 0, 0, 0, 115598, 0, 0, 0}, new long[] {1, 37, 2927, 68171, 183769, 4280053, 338355383, 7880431259L});
  }
}
