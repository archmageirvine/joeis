package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244876.
 * @author Sean A. Irvine
 */
public class A244876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244876() {
    super(new long[] {-1, 5, -7, -5, 22, -14, -14, 22, -5, -7, 5}, new long[] {1, 18, 154, 813, 3157, 9880, 26429, 62713, 135470, 271285, 510485});
  }
}
