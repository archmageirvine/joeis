package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128990 a(n) = (n^3 - n^2)*7^n.
 * @author Sean A. Irvine
 */
public class A128990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128990() {
    super(1, new long[] {-2401, 1372, -294, 28}, new long[] {0, 196, 6174, 115248});
  }
}
