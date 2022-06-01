package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105845 Numbers n such that n^2 = 41*m^2 + 41*m + 1.
 * @author Sean A. Irvine
 */
public class A105845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105845() {
    super(new long[] {-1, 0, 4098, 0}, new long[] {1, 4511, 8609, 18486079});
  }
}
