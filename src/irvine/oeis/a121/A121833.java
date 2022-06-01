package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121833 Expansion of 1/(1-x^2-x^3-x^6).
 * @author Sean A. Irvine
 */
public class A121833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121833() {
    super(new long[] {1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2});
  }
}
