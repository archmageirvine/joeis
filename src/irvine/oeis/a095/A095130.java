package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095130 Expansion of (x+x^2)/(1-x^6); period 6: repeat [0, 1, 1, 0, 0, 0].
 * @author Sean A. Irvine
 */
public class A095130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095130() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 0, 0});
  }
}
