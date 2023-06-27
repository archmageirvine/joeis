package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142155 Expansion of x/( 1+x-x^2-x^4-x^5-x^6-x^7+x^9+x^10 ).
 * @author Sean A. Irvine
 */
public class A142155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142155() {
    super(1, new long[] {-1, -1, 0, 1, 1, 1, 1, 0, 1, -1}, new long[] {1, -1, 2, -3, 6, -9, 17, -27, 48, -80});
  }
}
