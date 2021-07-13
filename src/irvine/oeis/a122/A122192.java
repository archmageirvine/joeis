package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122192 Sum of the n-th powers of the roots of the (reduced) weight enumerator of the extended Golay code (1 + 759*x^2 + 2576*x^3 + 759*x^4 + x^6).
 * @author Sean A. Irvine
 */
public class A122192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122192() {
    super(new long[] {-1, 0, -759, -2576, -759, 0}, new long[] {6, 0, -1518, -7728, 1149126, 9775920});
  }
}
