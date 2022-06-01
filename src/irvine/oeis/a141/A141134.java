package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141134 Hankel transform of C(2n+4,n+4).
 * @author Sean A. Irvine
 */
public class A141134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141134() {
    super(new long[] {-1, -2, -3, -4, -3, -2}, new long[] {1, -8, 8, 1, 1, -16});
  }
}
