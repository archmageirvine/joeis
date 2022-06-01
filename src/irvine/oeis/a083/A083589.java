package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083589 Expansion of 1/((1-4*x)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A083589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083589() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 4, 16, 64, 257});
  }
}
