package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059633 Expansion of g.f. x^3/(1 - 2*x + x^3 - x^4).
 * @author Sean A. Irvine
 */
public class A059633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059633() {
    super(3, new long[] {1, -1, 0, 2}, new long[] {1, 2, 4, 7});
  }
}
