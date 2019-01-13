package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185375.
 * @author Sean A. Irvine
 */
public class A185375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185375() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 1, 91, 966, 5082, 18447});
  }
}
